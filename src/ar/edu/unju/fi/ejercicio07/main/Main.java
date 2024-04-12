package ar.edu.unju.fi.ejercicio07.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio07.model.Empleado;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el nombre del empleado");
		String nombre = sc.nextLine();
		System.out.println("Ingrese legajo del empleado");
		String legajo = sc.nextLine();
		System.out.println("Ingrese salario del empleado");
		int salario = sc.nextInt();
		//sc.nextLine();
		Empleado empleado1 = new Empleado(nombre, legajo, salario);
		empleado1.mostrarDatos();
		empleado1.aumentoSalario();
		empleado1.mostrarDatos();
	}

}
