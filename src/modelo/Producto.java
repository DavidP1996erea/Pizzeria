package modelo;


public class Producto {
    public enum Tipo {MARGARITA, FUNGUI, CUATROESTACIONES}

    enum Estado {PEDIDO, SERVIDO}

    private static int totalProductosPreparados = 0;
    private static int totalProductosServidos = 0;
    protected Tipo tipo;
    private Estado estado;

    public static int getTotalProductosPreparados() {
        return totalProductosPreparados;
    }

    public static int getTotalProductosServidos() {
        return totalProductosServidos;
    }

    public Producto(Tipo tipo) {
        this.tipo = tipo;
        estado = Estado.PEDIDO;
        totalProductosPreparados++;
    }

    public void servir() {
        estado = Estado.SERVIDO;
        totalProductosServidos++;
    }

    @Override
    public String toString() {
        return String.format(
                "de tipo %s, se encuentra en estado %s",
                tipo, estado);
    }
}
