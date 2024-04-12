package ar.edu.unju.fi.ejercicio08.model;

public class CalculadoraEspecial {
	private int n;
	
	public CalculadoraEspecial() {
		int n = 0;
	}
	
	public double calcularSumatoria() {
        double sumatoria = 0;

        for (int k = 1; k <= n; k++) {
            double termino = Math.pow(k * (k + 1) / 2, 2);
            sumatoria += termino;
        }

        return sumatoria;
	}
	
	public double calcularProductoria() {
		double productoria = 0;
		
		for(int j = 1; j <= n; j++) {
			double termino = j * (j + 4);
			productoria+=termino;
		}
		return productoria;
	}
	
	

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
}
