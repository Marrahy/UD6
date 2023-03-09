package EJ4;

public class Articulo {
    String nombre;
    double precio;
    double iva = 21;
    int cuantosQuedan;

    public Articulo(String nombre, double precio, double iva, int cuantosQuedan) {
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
}
