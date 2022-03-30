package test.modelo.productos;

import modelo.productos.Producto;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @org.junit.jupiter.api.Test
    void Productos() {
        new Producto(Producto.Tipo.FUNGUI);
        int numeroProductosPreparados = 1;
        int numeroProductosServidos = 0;
        verificarAtributosProducto(numeroProductosPreparados,numeroProductosServidos);
    }

    @org.junit.jupiter.api.Test
    void ProductosCajaBlanca() {
        new Producto(Producto.Tipo.CUATROESTACIONES);
        int numeroProductosPreparados = 2;
        int numeroProductosServidos = 0;
        verificarAtributosProducto(numeroProductosPreparados,numeroProductosServidos);
    }

    private void verificarAtributosProducto(int numeroProductosPreparados,
                                            int numeroProductosServidos) {
        assertEquals(numeroProductosPreparados,
                Producto.getTotalProductosPreparados(),
                String.format("El número de productos preparados debería ser %d y es %d.",
                        numeroProductosPreparados, Producto.getTotalProductosPreparados()));
        assertEquals(numeroProductosServidos,
                Producto.getTotalProductosServidos(),
                String.format("El número de productos servidos debería ser %d y es %d.",
                        numeroProductosServidos, Producto.getTotalProductosServidos()));
    }

    @org.junit.jupiter.api.Test
    void getTotalProductosPreparados() {
    }

    @org.junit.jupiter.api.Test
    void getTotalProductosServidos() {
    }

    @org.junit.jupiter.api.Test
    void servir() {
    }
}