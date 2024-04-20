package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayT;

        try {
            do {
                System.out.print("Ingrese un número entero en el rango [3,10]: ");
                arrayT = sc.nextInt();
            } while (arrayT < 3 || arrayT > 10);

            int[] array = new int[arrayT];

            for (int i = 0; i < arrayT; i++) {
                System.out.print("Ingrese un número entero para la posición " + i + ": ");
                array[i] = sc.nextInt();
            }

            int sum = 0;
            System.out.println("Valores del array:");
            for (int i = 0; i < arrayT; i++) {
                System.out.println("Posición " + i + ": " + array[i]);
                sum += array[i];
            }
            System.out.println("La suma de todos los valores es: " + sum);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error. Ingrese un número entero.");
        } 
            
        
    }

}
