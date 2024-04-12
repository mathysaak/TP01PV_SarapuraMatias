package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
    private double precio;
    private double area;
    private boolean ingredientesEspeciales;
    public static final int INGREDIENTES_ESPECIALES_20 = 500;
    public static final int INGREDIENTES_ESPECIALES_30 = 750;
    public static final int INGREDIENTES_ESPECIALES_40 = 1000;

    public Pizza() {
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean getIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }

    public void calcularPrecio() {
        if (diametro == 20) {
            precio = (ingredientesEspeciales) ? 4500 + INGREDIENTES_ESPECIALES_20 : 4500;
        } else if (diametro == 30) {
            precio = (ingredientesEspeciales) ? 4800 + INGREDIENTES_ESPECIALES_30 : 4800;
        } else if (diametro == 40) {
            precio = (ingredientesEspeciales) ? 5500 + INGREDIENTES_ESPECIALES_40 : 5500;
        }
    }

    public void calcularArea() {
        double radio = diametro / 2.0;
        area = Math.PI * Math.pow(radio, 2);
    }
}
