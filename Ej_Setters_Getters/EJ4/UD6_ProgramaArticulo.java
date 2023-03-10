package Ej_Setters_Getters.EJ4;

public class UD6_ProgramaArticulo {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo();

        articulo1.setNombre("Pijama");
        articulo1.setPrecio(7.68);
        articulo1.setIva(21);
        articulo1.setCuantosQuedan(120);

        String producto = articulo1.getNombre();
        double precioBase = articulo1.getPrecio();
        double IVA = articulo1.getIva();
        double precioConIVA = precioBase * (IVA / 100 + 1);
        int stock = articulo1.getCuantosQuedan();

        System.out.println(producto + " - " + "Precio: " + precioBase + "€" + " - " + IVA + "%" + " - " + "Precio con IVA: " + precioConIVA + "€" + " - " + "Quedan: " + stock);
    }
}
