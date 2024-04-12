package ar.edu.unju.fi.ejercicio04;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		double factorial = 1;
		boolean band = true;
		while(band) {
			System.out.println("Ingrese numero :");
			if(scanner.hasNextInt()) {
				int num = scanner.nextInt();
				if(num<0 || num >10) {
					System.out.println("Solo calcula con numeros del 0 al 10 !");
				}
				else {
					while(num!=0) {
						factorial=factorial*num;
						num--;
					}
					System.out.println("El FACTORIAL ES: "+factorial);
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