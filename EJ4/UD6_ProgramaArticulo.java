package EJ4;

public class UD6_ProgramaArticulo {
    public static void main(String[] args) {
        Articulo producto = new Articulo(15, 21, 127);
        producto.nombre = "Pijama";
        producto.precio = 15;
        producto.cuantosQuedan = 127;

        double precioPVP = producto.precio * (producto.iva / 100 + 1);

        System.out.print(producto.nombre + " - ");
        System.out.println("Precio: " + producto.precio + "€" + " - ");
        System.out.print("IVA: " + producto.iva + "%" + " - ");
        System.out.println("PVP: " + precioPVP + "€");
    }
}