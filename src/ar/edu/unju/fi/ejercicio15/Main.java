package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero en el rango [5,10]
        try {
        int arrT;
        do {
            System.out.print("Ingrese un número entero en el rango [5,10]: ");
            arrT = scanner.nextInt();
        } while (arrT < 5 || arrT > 10);

        // Crear un array de tipo String con el tamaño ingresado por el usuario
        String[] nombres = new String[arrT];

        // Solicitar al usuario que ingrese nombres de personas para cada posición del array
        for (int i = 0; i < arrT; i++) {
            System.out.print("Ingrese el nombre de la persona para la posición " + i + ": ");
            nombres[i] = scanner.next();
        }

        // Mostrar el contenido del array comenzando desde el primer índice
        System.out.println("Contenido del array (comenzando desde el primer índice):");
        for (int i = 0; i < arrT; i++) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }

        // Mostrar el contenido del array comenzando desde el último índice
        System.out.println("Contenido del array (comenzando desde el último índice):");
        for (int i = arrT - 1; i >= 0; i--) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }
        //Controlar excepciones
        }catch( Exception e) {
        	System.out.print("Error. Ingrese un entero.");
        }
        

        // Cerrar el scanner
        scanner.close();
    }
}
