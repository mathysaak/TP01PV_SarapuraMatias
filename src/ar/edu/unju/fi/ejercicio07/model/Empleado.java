package ar.edu.unju.fi.ejercicio07.model;

public class Empleado {

	private String nombre;
	private String legajo;
	private int salario;
	
	final int SALARIO_MINIMO = 210000;
	final int AUMENTO_MERITO = 20000;
	
	public Empleado(String nombre, String legajo, int salario){
		this.nombre = nombre;
		this.legajo = legajo;
		if(salario >= SALARIO_MINIMO) {
			this.salario = salario;
		}else {
			this.salario = SALARIO_MINIMO;
		}
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre del empleado: "+this.nombre);
		System.out.println("Legajo: "+this.legajo);
		System.out.println("Salario: $"+this.salario);
	}
	public int aumentoSalario() {
		return salario+= AUMENTO_MERITO;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public String getLegajo() {
		return this.legajo;
	}
	public int getSalario() {
		return this.salario;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
}
