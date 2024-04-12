package ar.edu.unju.fi.ejercicio03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean band = true;

        System.out.println("Ingrese un entero: ");

        while (band) {
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                if (number % 2 == 0) {
                    number *= 3;
                    System.out.println(number);
                } else {
                    number *= 2;
                    System.out.println(number);
                }
                band = false; 
            } else {
                System.out.println("Dato Incorrecto, ingrese un entero");
                sc.nextLine(); 
            }
        }
    }
}
