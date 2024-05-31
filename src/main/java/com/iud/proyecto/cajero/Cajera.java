
package com.iud.proyecto.cajero;

import java.util.List;


public class Cajera {
    private String nombre;

    public Cajera(String nombre) {
        this.nombre = nombre;
    }

    public void cobrar(Cliente cliente, List<Producto> productos) {
        System.out.println("----------------------------------");
        System.out.println("Cajera: " + nombre);
        System.out.println("Cliente: " + cliente.getNombre() + " (ID: " + cliente.getId() + ")");
        System.out.println("Compra:");

        double total = 0;
        for (Producto producto : productos) {
            System.out.println("- " + producto.getNombre() + ": $" + producto.getPrecio());
            total += producto.getPrecio();
        }

        System.out.println("Total a pagar: $" + total);
        System.out.println("----------------------------------");
    }
}
