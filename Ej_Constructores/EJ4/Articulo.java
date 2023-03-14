package EJ4;

public class Articulo {
    String nombre;
    double precio;
    double iva = 21;
    int cuantosQuedan;

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
    public Articulo(double precio, double iva, int cuantosQuedan) {
        if (iva > 0 && iva < 100)
            this.iva = iva;
        else
            System.out.println("ERROR al instanciar el valor del iva, debe que estar por encima de 0 o por debajo de 100");
        if (precio >= 0)
            this.precio = precio;
        else
            System.out.println("ERROR al instanciar el valor del precio");
        if (cuantosQuedan >= 0)
            this.cuantosQuedan = cuantosQuedan;
        else
            System.out.println("ERROR al instanciar el número de productos en el almacén");
    }
    public double getPVP() {
        double precioPVP = precio * (iva / 100 + 1);
        return precioPVP;
    }
    public void imprime() {
        System.out.println("Nombre: " + nombre + " - " + "Precio: " + precio + "€");
        System.out.println("IVA: " + iva + "%" + " - " + "PVP: " + getPVP() + "€");
        System.out.println("Quedan: " + cuantosQuedan + " unidades");
    }
}
