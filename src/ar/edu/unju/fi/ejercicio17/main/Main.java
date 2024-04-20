package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<>();

        int opcion;
        try {
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer del scanner

            try {
                switch (opcion) {
                    case 1:
                        altaJugador(sc, jugadores);
                        break;
                    case 2:
                        mostrarDatosJugador(sc, jugadores);
                        break;
                    case 3:
                        mostrarJugadoresOrdenadosPorApellido(jugadores);
                        break;
                    case 4:
                        modificarDatosJugador(sc, jugadores);
                        break;
                    case 5:
                        eliminarJugador(sc, jugadores);
                        break;
                    case 6:
                        mostrarCantidadTotalJugadores(jugadores);
                        break;
                    case 7:
                        mostrarCantidadJugadoresPorNacionalidad(sc, jugadores);
                        break;
                    case 8:
                        System.out.println("Fin de programa.");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } catch (Exception e) {
                System.out.println("Error, ingrese un numero.");
            } finally {
                System.out.println();
            }

        } while (opcion != 8);
        } catch (Exception e) { System.out.println("Error, ingrese un numero.");}

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("1 - Alta de jugador");
        System.out.println("2 - Mostrar los datos del jugador");
        System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
        System.out.println("4 - Modificar los datos de un jugador");
        System.out.println("5 - Eliminar un jugador");
        System.out.println("6 - Mostrar la cantidad total de jugadores");
        System.out.println("7 - Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
        System.out.println("8 - Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void altaJugador(Scanner sc, ArrayList<Jugador> jugadores) {
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el apellido del jugador: ");
        String apellido = sc.nextLine();
        System.out.print("Ingrese la fecha de nacimiento (yyyy-MM-dd): ");
        LocalDate fechaNacimiento = LocalDate.parse(sc.nextLine());
        System.out.print("Ingrese la nacionalidad del jugador: ");
        String nacionalidad = sc.nextLine();
        System.out.print("Ingrese la estatura del jugador en cm: ");
        int estatura = sc.nextInt();
        System.out.print("Ingrese el peso del jugador: ");
        double peso = sc.nextDouble();
        System.out.print("Ingrese la posición del jugador: ");
        String posicion = sc.next();

        Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
        jugadores.add(jugador);
        System.out.println("Jugador agregado correctamente.");
    }

    private static void mostrarDatosJugador(Scanner sc, ArrayList<Jugador> jugadores) {
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el apellido del jugador: ");
        String apellido = sc.nextLine();

        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
                System.out.println(jugador);
                return;
            }
        }
        System.out.println("No se encontró al jugador.");
    }

    private static void mostrarJugadoresOrdenadosPorApellido(ArrayList<Jugador> jugadores) {
        // Ordenar los jugadores por apellido 
        for (int i = 0; i < jugadores.size() - 1; i++) {
            for (int j = 0; j < jugadores.size() - i - 1; j++) {
                String apellido1 = jugadores.get(j).getApellido();
                String apellido2 = jugadores.get(j + 1).getApellido();
                if (apellido1.compareTo(apellido2) > 0) {
                    // Intercambiar los jugadores
                    Jugador temp = jugadores.get(j);
                    jugadores.set(j, jugadores.get(j + 1));
                    jugadores.set(j + 1, temp);
                }
            }
        }
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
    }


    private static void modificarDatosJugador(Scanner sc, ArrayList<Jugador> jugadores) {
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el apellido del jugador: ");
        String apellido = sc.nextLine();

        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
                System.out.println("Ingrese los nuevos datos del jugador:");
                System.out.print("Nuevo nombre: ");
                jugador.setNombre(sc.nextLine());
                System.out.print("Nuevo apellido: ");
                jugador.setApellido(sc.nextLine());
                System.out.print("Nueva fecha de nacimiento (yyyy-MM-dd): ");
                jugador.setFechaNacimiento(LocalDate.parse(sc.nextLine()));
                System.out.print("Nueva nacionalidad: ");
                jugador.setNacionalidad(sc.nextLine());
                System.out.print("Nueva estatura en cm: ");
                jugador.setEstatura(sc.nextInt());
                System.out.print("Nuevo peso: ");
                jugador.setPeso(sc.nextDouble());
                System.out.print("Nueva posición: ");
                jugador.setPosicion(sc.next());
                System.out.println("Datos del jugador modificados correctamente.");
                return;
            }
        }

        System.out.println("No se encontró al jugador.");
    }

    private static void eliminarJugador(Scanner sc, ArrayList<Jugador> jugadores) {
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el apellido del jugador: ");
        String apellido = sc.nextLine();

        Iterator<Jugador> iterador = jugadores.iterator();
        while (iterador.hasNext()) {
            Jugador jugador = iterador.next();
            if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
                iterador.remove();
                System.out.println("Jugador eliminado correctamente.");
                return;
            }
        }
        System.out.println("No se encontró al jugador.");
    }

    private static void mostrarCantidadTotalJugadores(ArrayList<Jugador> jugadores) {
        System.out.println("Cantidad total de jugadores: " + jugadores.size());
    }

    private static void mostrarCantidadJugadoresPorNacionalidad(Scanner sc, ArrayList<Jugador> jugadores) {
        System.out.print("Ingrese la nacionalidad para contar los jugadores: ");
        String nacionalidad = sc.nextLine();

        int contador = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                contador++;
            }
        }
        System.out.println("Cantidad de jugadores de nacionalidad " + nacionalidad + ": " + contador);
    }
}