package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pais> paises = precargarPaises();
        ArrayList<DestinoTuristico> destinos = new ArrayList<>();

        int opcion;
        try {
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer del scanner

            try {
                switch (opcion) {
                    case 1:
                        altaDestinoTuristico(sc, paises, destinos);
                        break;
                    case 2:
                        mostrarTodosDestinosTuristicos(destinos);
                        break;
                    case 3:
                        modificarPaisDestinoTuristico(sc, paises, destinos);
                        break;
                    case 4:
                        limpiarArrayListDestinosTuristicos(destinos);
                        break;
                    case 5:
                        eliminarDestinoTuristico(sc, destinos);
                        break;
                    case 6:
                        mostrarDestinosOrdenadosPorNombre(destinos);
                        break;
                    case 7:
                        mostrarTodosPaises(paises);
                        break;
                    case 8:
                        mostrarDestinosPorPais(sc, destinos);
                        break;
                    case 9:
                        System.out.println("Fin del programa.");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } catch (Exception e) {
                System.out.println("Error, ingrese un valor valido");
            } finally {
                System.out.println();
            }

        } while (opcion != 9);
        }catch (Exception e) {
            System.out.println("Error ingrese un numero.");
        } 

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("1 - Alta de destino turístico");
        System.out.println("2 - Mostrar todos los destinos turísticos");
        System.out.println("3 - Modificar el país de un destino turístico");
        System.out.println("4 - Limpiar el ArrayList de destino turísticos");
        System.out.println("5 - Eliminar un destino turístico");
        System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre");
        System.out.println("7 - Mostrar todos los países");
        System.out.println("8 - Mostrar los destinos turísticos que pertenecen a un país");
        System.out.println("9 - Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static ArrayList<Pais> precargarPaises() {
        ArrayList<Pais> paises = new ArrayList<>();
        paises.add(new Pais("001", "Argentina"));
        paises.add(new Pais("002", "Brasil"));
        paises.add(new Pais("003", "Chile"));
        paises.add(new Pais("004", "Bolivia"));
        paises.add(new Pais("005", "Peru"));
        paises.add(new Pais("006", "Uruguay"));
        paises.add(new Pais("007", "Ecuador"));
        paises.add(new Pais("008", "Colombia"));
        return paises;
    }

    private static void altaDestinoTuristico(Scanner sc, ArrayList<Pais> paises, ArrayList<DestinoTuristico> destinos) {
        System.out.println("Alta de destino turístico:");
        System.out.print("Ingrese el código del destino turístico: ");
        String codigoDestino = sc.nextLine();

        System.out.print("Ingrese el nombre del destino turístico: ");
        String nombreDestino = sc.nextLine();

        System.out.print("Ingrese el precio del destino turístico: ");
        double precioDestino = sc.nextDouble();

        System.out.print("Ingrese el código del país asociado al destino turístico: ");
        String codigoPais = sc.next();
        sc.nextLine(); // Limpiar el buffer del scanner

        Pais paisAsociado = buscarPaisPorCodigo(paises, codigoPais);
        if (paisAsociado == null) {
            System.out.println("El código de país ingresado no corresponde a ningún país.");
            return;
        }

        System.out.print("Ingrese la cantidad de días del destino turístico: ");
        int cantidadDias = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer del scanner

        DestinoTuristico nuevoDestino = new DestinoTuristico(codigoDestino, nombreDestino, precioDestino, paisAsociado, cantidadDias);
        destinos.add(nuevoDestino);
        System.out.println("Destino turístico agregado correctamente.");
    }


    private static Pais buscarPaisPorCodigo(ArrayList<Pais> paises, String codigo) {
        for (Pais pais : paises) {
            if (pais.getCodigo().equals(codigo)) {
                return pais;
            }
        }
        return null;
    }

    private static void mostrarTodosDestinosTuristicos(ArrayList<DestinoTuristico> destinos) {
        System.out.println("Listado de destinos turísticos:");
        for (DestinoTuristico destino : destinos) {
            System.out.println(destino);
        }
    }

    private static void modificarPaisDestinoTuristico(Scanner sc, ArrayList<Pais> paises, ArrayList<DestinoTuristico> destinos) {
        System.out.println("Modificar el país de un destino turístico:");
        System.out.print("Ingrese el código del destino turístico que desea modificar: ");
        String codigoDestino = sc.nextLine();

        DestinoTuristico destinoAModificar = buscarDestinoPorCodigo(destinos, codigoDestino);
        if (destinoAModificar == null) {
            System.out.println("El código de destino turístico ingresado no corresponde a ningún destino turístico.");
            return;
        }

        System.out.print("Ingrese el nuevo código del país asociado al destino turístico: ");
        String nuevoCodigoPais = sc.nextLine();
        Pais nuevoPais = buscarPaisPorCodigo(paises, nuevoCodigoPais);

        if (nuevoPais != null) {
            destinoAModificar.setPais(nuevoPais);
            System.out.println("País del destino turístico modificado correctamente.");
        } else {
            System.out.println("El código de país ingresado no corresponde a ningún país.");
        }
    }

    private static DestinoTuristico buscarDestinoPorCodigo(ArrayList<DestinoTuristico> destinos, String codigo) {
        for (DestinoTuristico destino : destinos) {
            if (destino.getCodigo().equals(codigo)) {
                return destino;
            }
        }
        return null;
    }


    private static void limpiarArrayListDestinosTuristicos(ArrayList<DestinoTuristico> destinos) {
        destinos.clear();
        System.out.println("ArrayList de destinos turísticos limpiado correctamente.");
    }

    private static void eliminarDestinoTuristico(Scanner sc, ArrayList<DestinoTuristico> destinos) {
        System.out.println("Eliminar un destino turístico:");
        System.out.print("Ingrese el código del destino turístico que desea eliminar: ");
        String codigoDestino = sc.nextLine();

        Iterator<DestinoTuristico> iterator = destinos.iterator();
        while (iterator.hasNext()) {
            DestinoTuristico destino = iterator.next();
            if (destino.getCodigo().equals(codigoDestino)) {
                iterator.remove();
                System.out.println("Destino turístico eliminado correctamente.");
                return;
            }
        }

        System.out.println("El código de destino turístico ingresado no corresponde a ningún destino turístico.");
    }


    private static void mostrarDestinosOrdenadosPorNombre(ArrayList<DestinoTuristico> destinos) {
        System.out.println("Destinos turísticos ordenados por nombre:");
        Collections.sort(destinos, Comparator.comparing(DestinoTuristico::getNombre));
        for (DestinoTuristico destino : destinos) {
            System.out.println(destino);
        }
    }

    private static void mostrarTodosPaises(ArrayList<Pais> paises) {
        System.out.println("Listado de países:");
        for (Pais pais : paises) {
            System.out.println(pais);
        }
    }

    private static void mostrarDestinosPorPais(Scanner sc, ArrayList<DestinoTuristico> destinos) {
        System.out.println("Mostrar destinos turísticos por país:");
        System.out.print("Ingrese el código del país: ");
        String codigoPais = sc.nextLine();

        System.out.println("Destinos turísticos para el país con código " + codigoPais + ":");
        for (DestinoTuristico destino : destinos) {
            if (destino.getPais().getCodigo().equals(codigoPais)) {
                System.out.println(destino);
            }
        }
    }
}