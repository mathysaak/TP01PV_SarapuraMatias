package ar.edu.unju.fi.ejercicio08.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio08.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		
		if(sc.hasNextInt()){
			int valor1 = sc.nextInt();
			if(valor1 >= 0) {
				CalculadoraEspecial calcu = new CalculadoraEspecial();
				
				calcu.setN(valor1);

				System.out.println("Productoria: "+calcu.calcularProductoria());
				System.out.println("Sumatoria: "+calcu.calcularSumatoria());
			}else {
				System.out.println("Ingrese un entero positivo.");
			}
			

			
		}else {
			System.out.println("Ingrese un entero.");
		}		
	}

}
