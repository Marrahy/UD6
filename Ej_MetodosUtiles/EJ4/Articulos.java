package Ej_MetodosUtiles.EJ4;

public class Articulos {
    private String nombre;
    private int precio, iva, cuantosQuedan;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }
    public void setIva(int iva) {
        this.iva = iva;
    }
    public int getIva() {
        return iva;
    }
    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }
    public int getCuantosQuedan() {
        return cuantosQuedan;
    }
    public double getPVPDescuento(int descuento) {
        return getPVP() * (descuento / 100 - 1);
    }
    public void imprime() {
        System.out.println("- " + nombre);
        System.out.println("Precio sin iva: " + precio + "€");
    }
    public double getPVP() {
        return precio * (iva / 100 + 1);
    }
    public boolean vender(int x) {
        int vendidos = this.cuantosQuedan - x;
        if (vendidos > cuantosQuedan) {
            System.out.println("Se han vendido: " + x);
            cuantosQuedan = vendidos;
            System.out.println("Quendan: " + cuantosQuedan);
            return true;
        }
        else
            return false;
    }
    public boolean almacenar(int x) {
        int almacenados = this.cuantosQuedan + x;
        if (almacenados > cuantosQuedan) {
            System.out.println("Se han almacenado: " + x);
            cuantosQuedan = almacenados;
            System.out.println("Quedan: " + cuantosQuedan);
            return true;
        }
        else
            return false;
    }
}