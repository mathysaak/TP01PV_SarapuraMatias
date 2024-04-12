package ar.edu.unju.fi.ejercicio10.main;

import ar.edu.unju.fi.ejercicio10.model.Pizza;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

	    for (int i = 1; i <= 3; i++) {
	        System.out.println("* Pizza " + i + " *");
	        Pizza pizza = new Pizza();
	        System.out.print("Ingrese el diámetro de la pizza (20, 30, o 40): ");
	        pizza.setDiametro(scanner.nextInt());
	        scanner.nextLine(); 
	        System.out.print("¿Tiene ingredientes especiales (si/no)? ");
	        String input = scanner.nextLine();
	        if(input == "si" || input == "Si") {
		        pizza.setIngredientesEspeciales(true);
	        }else if (input == "no" || input == "No"){
	        	pizza.setIngredientesEspeciales(false);
	        }


	        pizza.calcularPrecio();
	        pizza.calcularArea();

	        System.out.printf("Diámetro = %d%n", pizza.getDiametro());
	        System.out.printf("Ingredientes especiales = %s%n", pizza.getIngredientesEspeciales());
	        System.out.printf("Precio Pizza = %.2f$%n", pizza.getPrecio());
	        System.out.printf("Área de la pizza = %.4f cm²%n", pizza.getArea());
	        System.out.println();
	        
	    }
	}

}