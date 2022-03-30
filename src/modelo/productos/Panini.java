package modelo.productos;


public class Panini extends Producto {
    public static int getTotalPaninisPreparados() {
        return totalPaninisPreparados;
    }

    public static int getTotalPaninisServidos() {
        return totalPaninisServidos;
    }

    public enum TamanoPanini {ALMERIA, GRANADA, SEVILLA}

    public enum Racion {DOBLE, SIMPLE}

    private final TamanoPanini tamano;
    private final Racion racion;
    private static int totalPaninisPreparados = 0;
    private static int totalPaninisServidos = 0;

    public Panini(Tipo tipo, TamanoPanini tamano, Racion racion) {
        super(tipo);
        this.tamano = tamano;
        this.racion = racion;
        totalPaninisPreparados++;
    }

    @Override
    public void servir() {
        super.servir();
        totalPaninisServidos++;
    }

    @Override
    public String toString() {
        return String.format(
                "El panini pedido es %s y de tamaño %s y de ración %s",
                super.toString(), tamano, racion);
    }
}
