package Ej_MetodosUtiles.EJ4;

public class UD6_ProgramaArticulos {
    public static void main(String[] args) {
        
        Articulos articulo = new Articulos();
        articulo.setNombre("Teclado");
        articulo.setPrecio(150);
        articulo.setIva(54);
        articulo.setCuantosQuedan(120);
        articulo.imprime();
    }
    
}
