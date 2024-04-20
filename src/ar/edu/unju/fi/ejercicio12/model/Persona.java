package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona {
	
	private String nombre;
    private Calendar fechaNacimiento;

    public Persona(String nombre, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.fechaNacimiento = new GregorianCalendar(anio, mes - 1, dia);
    }

    public int getEdad() {
        Calendar fechaActual = new GregorianCalendar();
        int edad = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        //
        if (fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        return edad;
    }

    public String getZodiaco() {
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1;
        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);

        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) return "Acuario";
        if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) return "Piscis";
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) return "Aries";
        if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) return "Tauro";
        if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) return "Géminis";
        if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) return "Cáncer";
        if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) return "Leo";
        if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) return "Virgo";
        if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) return "Libra";
        if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) return "Escorpio";
        if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) return "Sagitario";
        return "Capricornio";
    }

    public String getEstacion() {
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1;
        int dia = fechaNacimiento.get(Calendar.DATE);
        if ((mes >= 12 && dia > 21) || (mes <= 2 && dia < 21)) {
            return "Verano";
        } else if ((mes >= 3 && dia >=21) && (mes <= 5 && dia < 21) ){
            return "Otoño";
        } else if ((mes >= 6 && dia >=21) && (mes <= 9 && dia < 21)) {
            return "Invierno";
        } else {
            return "Primavera";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }
}
