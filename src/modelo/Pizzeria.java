package modelo;

import modelo.productos.Panini;
import modelo.productos.Pizza;
import modelo.productos.Producto;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private List<Producto> listProducto = new ArrayList<>();

    public void añadirProducto(Producto producto) {
        listProducto.add(producto);
    }

    public void crearProductosEjemplo() {
        listProducto.add(new Pizza(Producto.Tipo.MARGARITA, Pizza.Tamano.FAMILIAR));
        listProducto.add(new Pizza(Producto.Tipo.FUNGUI, Pizza.Tamano.FAMILIAR));
        listProducto.add(new Pizza(Producto.Tipo.CUATROESTACIONES, Pizza.Tamano.MEDIANA));
        listProducto.add(new Panini(Producto.Tipo.FUNGUI, Panini.TamanoPanini.SEVILLA, Panini.Racion.DOBLE));
        listProducto.add(new Panini(Producto.Tipo.CUATROESTACIONES, Panini.TamanoPanini.GRANADA, Panini.Racion.SIMPLE));
    }

    public void servirProductos(int[] posicion) {
        for (int pos :  posicion) {
            listProducto.get(pos).servir();
        }
    }

    public void servirTodosProductos() {
        for (Producto producto :
                listProducto) {
            producto.servir();
        }
    }

    public void mostrarTodosProductos() {
        for (Producto producto :
                listProducto) {
            System.out.println(producto.toString());
        }
    }

    public void mostrarTotales() {
        System.out.printf("El total de pizzas pedidas es %d,",
                Pizza.getTotalPizzasPreparadas());
        System.out.printf(" y el total de pizzas servidas es %d.%n",
                Pizza.getTotalPizzasServidas());

        System.out.printf("El total de paninis pedidos es %d,",
                Panini.getTotalPaninisPreparados());
        System.out.printf(" y el total de paninis servidos es %d.%n",
                Panini.getTotalPaninisServidos());

        System.out.printf("El total de productos pedidos es %d,",
                Producto.getTotalProductosPreparados());
        System.out.printf(" y el total de pizzas servidos es %d.%n",
                Producto.getTotalProductosServidos());
    }


}
