package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] array1 = new int[8];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < array1.length ; i++) {
			System.out.println("Ingrese un numero en el Array: ");
			array1[i] = sc.nextInt();
		}
		for(int i = 0; i < array1.length ; i++) {
			System.out.println("El numero en la posicion ["+i+"] es "+array1[i]);
		}
	}

}
