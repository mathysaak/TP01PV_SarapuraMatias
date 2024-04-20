package ar.edu.unju.fi.ejercicio11;

public class Main {

	public static void main(String[] args) {
		int total;
		for(int i = 2, j = 40; j > 0; j--) {
			total = i*j;
			
			//System.out.println(i + " x "+j+" = "+total); //Prueba
			System.out.print(total+" ");
			i++;
		}

	}

}
