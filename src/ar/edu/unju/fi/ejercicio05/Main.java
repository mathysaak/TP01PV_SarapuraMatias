package ar.edu.unju.fi.ejercicio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int tabla = 1;
		int total = 1;
		
		boolean band = true;
		while(band) {
			System.out.println("Ingrese numero :");
			if(scanner.hasNextInt()) {
				int num = scanner.nextInt();
				if(num<1 || num >9) {
					System.out.println("Solo calcula con numeros del 1 al 9!");
				}
				else {
					for(int i = 0; i <= 10 ;i++) {
						total = num * i;
						System.out.println(num+" x "+i+" = "+total);
					}

				}
				band = false;
			}
			else {
				System.out.println("Se ingreso datos incorrectos");
				band = true;
				scanner.nextLine();
			}
		}
	}

}
