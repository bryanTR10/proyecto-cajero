
package com.iud.proyecto.cajero;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class SimulacionCobro {
    public static void main(String[] args) {
        // Crear una lista de clientes
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Luis Rodriguez", 1));
        clientes.add(new Cliente("Carla Sierra", 2));
        clientes.add(new Cliente("Sandra Gustamante", 3));

        // Crear una cajera
        Cajera cajera = new Cajera("Ana");

        // Simular el proceso de cobro para cada cliente
        for (Cliente cliente : clientes) {
            // Simular la compra del cliente
            List<Producto> productos = generarCompraAleatoria();

            // Realizar el cobro
            cajera.cobrar(cliente, productos);
        }
    }

    // Método para generar una compra aleatoria de productos
    private static List<Producto> generarCompraAleatoria() {
        List<Producto> productos = new ArrayList<>();
        Random random = new Random();
        int numProductos = random.nextInt(5) + 1; // Entre 1 y 5 productos

        for (int i = 0; i < numProductos; i++) {
            String nombreProducto = "Producto " + (i + 1);
            double precio = random.nextDouble() * 100; // Precio aleatorio
            productos.add(new Producto(nombreProducto, precio));
        }
        return productos;
    }
}
