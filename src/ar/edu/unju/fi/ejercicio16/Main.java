package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[5];

        // Pedir al usuario que ingrese los nombres de las personas
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i) + ": ");
            nombres[i] = sc.nextLine();
        }

        // Mostrar los valores guardados en el array usando un while
        System.out.println("Valores guardados en el array:");
        int j = 0;
        while (j < nombres.length) {
            System.out.println(nombres[j]);
            j++;
        }

        // Mostrar el tamaño del array
        System.out.println("Tamaño del array: " + nombres.length);

        // Solicitar al usuario que ingrese el índice de un elemento a eliminar
        byte indiceAEliminar;
        do {
            System.out.print("Ingrese el índice de un elemento a eliminar (0-4): ");
            indiceAEliminar = sc.nextByte();
        } while (indiceAEliminar < 0 || indiceAEliminar >= nombres.length);

        // Eliminar el elemento del arreglo y desplazar los otros elementos si es necesario
        for (int i = (int) indiceAEliminar; i < nombres.length - 1; i++) {
            nombres[i] = nombres[i + 1];
        }
        nombres[nombres.length - 1] = ""; // Asignar un espacio en blanco para eliminar el último elemento

        // Mostrar el arreglo después de eliminar el elemento
        System.out.println("Arreglo después de eliminar el elemento:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Cerrar el scanner
        sc.close();
    }
}
