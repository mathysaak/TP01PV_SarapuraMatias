package ar.edu.unju.fi.ejercicio06.model;

import java.time.LocalDate;

public class Persona {
private String dni;
private String nombre;
private LocalDate fechaNac;
private String provincia;

public Persona() {
    this.dni = "";
    this.nombre = "";
    this.fechaNac = LocalDate.now();
    this.provincia = "";
}


public Persona(String dni, String nombre, LocalDate fechaNac, String provincia) {

	this.dni = dni;
	this.nombre = nombre;
	this.fechaNac = fechaNac;
	this.provincia = provincia;
}

public Persona(String dni, String nombre, LocalDate fechaNac) {
    this.dni = dni;
    this.nombre = nombre;
    this.fechaNac = fechaNac;
    this.provincia = "Jujuy";
}

public int calcularEdad() {
    LocalDate hoy = LocalDate.now();
    int edad = hoy.getYear() - fechaNac.getYear();

    if (hoy.getMonthValue() < fechaNac.getMonthValue() || (hoy.getMonthValue() == fechaNac.getMonthValue() && hoy.getDayOfMonth() < fechaNac.getDayOfMonth())) {
        edad--;
    }
    return edad;
}
public boolean esMayorDeEdad() {
    return calcularEdad() > 18;
}
public void mostrarDatos() {
    System.out.println("Nombre: " + nombre);
    System.out.println("DNI: " + dni);
    System.out.println("Fecha de nacimiento: " + fechaNac);
    System.out.println("Provincia: " + provincia);
    System.out.println("Edad: " + calcularEdad());

    if (esMayorDeEdad()) {
        System.out.println("La persona es mayor de edad");
    } else {
        System.out.println("La persona no es mayor de edad");
    }
}

public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public LocalDate getFechaNac() {
	return fechaNac;
}
public void setFechaNac(LocalDate fechaNac) {
	this.fechaNac = fechaNac;
}
public String getProvincia() {
	return provincia;
}
public void setProvincia(String provincia) {
	this.provincia = provincia;
}



}
