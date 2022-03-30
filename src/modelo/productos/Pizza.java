package modelo.productos;


public class Pizza extends Producto {
    public static int getTotalPizzasPreparadas() {
        return totalPizzasPreparadas;
    }

    public static int getTotalPizzasServidas() {
        return totalPizzasServidas;
    }

    public enum Tamano {MEDIANA, FAMILIAR}

    private final Tamano tamano;
    private static int totalPizzasPreparadas = 0;
    private static int totalPizzasServidas = 0;

    public Pizza(Tipo tipo, Tamano tamano) {
        super(tipo);
        this.tamano = tamano;
        totalPizzasPreparadas++;
    }

    @Override
    public void servir() {
        super.servir();
        totalPizzasServidas++;
    }

    @Override
    public String toString() {
        return String.format(
                "La pizza pedida es %s y de tamaño %s",
                super.toString(), tamano);
    }
}
