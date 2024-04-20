package ar.edu.unju.fi.ejercicio12.main;

import ar.edu.unju.fi.ejercicio12.model.Persona;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Fecha de nacimiento: (dd/MM/yyyy): ");
        String fechaNacimientoToString = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoToString, formatter);

        Calendar fechaNacimientoCal = new GregorianCalendar(fechaNacimiento.getYear(), fechaNacimiento.getMonthValue() - 1, fechaNacimiento.getDayOfMonth());

        Persona persona = new Persona(nombre, fechaNacimientoCal.get(Calendar.YEAR), fechaNacimientoCal.get(Calendar.MONTH) + 1, fechaNacimientoCal.get(Calendar.DAY_OF_MONTH));

        System.out.println("\nDatos de la persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + fechaNacimientoToString);

        System.out.println("\nResultados:");
        System.out.println("Edad: " + persona.getEdad() + " años.");
        System.out.println("Signo del zodiaco: " + persona.getZodiaco());
        System.out.println("Estación del año: " + persona.getEstacion());
		
	}

}