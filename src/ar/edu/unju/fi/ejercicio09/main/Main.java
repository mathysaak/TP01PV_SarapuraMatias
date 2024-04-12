package ar.edu.unju.fi.ejercicio09.main;

import ar.edu.unju.fi.ejercicio09.model.Producto;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Producto[] productos = new Producto[3];

        for (int i = 0; i < productos.length; i++) {
            Producto producto = new Producto();

            System.out.println("Ingrese los datos para el producto " + (i + 1) + ":");
            System.out.print("Nombre: ");
            producto.setNombre(scanner.nextLine());
            System.out.print("Código: ");
            producto.setCodigo(scanner.nextInt());
            System.out.print("Precio: ");
            producto.setPrecio(scanner.nextDouble());
            System.out.print("Descuento (%): ");
            producto.setDescuento(scanner.nextInt());

            scanner.nextLine();

            productos[i] = producto;
        }

        for (int i = 0; i < productos.length; i++) {
            System.out.println("\nDatos del producto " + (i + 1) + ":");
            System.out.println("Nombre: " + productos[i].getNombre());
            System.out.println("Código: " + productos[i].getCodigo());
            System.out.println("Precio: $" + productos[i].getPrecio());
            System.out.println("Descuento (%): " + productos[i].getDescuento());
            System.out.println("Precio con descuento: $" + productos[i].calcularDescuento());
        }
    }
}