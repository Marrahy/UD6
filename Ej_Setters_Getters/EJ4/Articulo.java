package Ej_Setters_Getters;

public class Articulo {
    private String nombre;
    private double precio, iva;
    private int cuantosQuedan;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }
    public void setIva(double iva) {
        this.iva = iva;
    }
    public double getIva() {
        return iva;
    }
    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }
    public int getCuantosQuedan() {
        return cuantosQuedan;
    }
}
