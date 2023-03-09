//Sergi Marrahy Arenas
/**
 * ENCAPSULAMIENTO
 */

public class UD6_ProgramaPunto {
    public static void main(String[] args) {
        Punto punto = new Punto();

        punto.setX(5);
        punto.setY(0);

        int puntoX = punto.getX();
        int puntoY = punto.getY();
        
        System.out.println("Coordenada X: " + puntoX);
        System.out.println("Coordenada Y: " + puntoY);
    }
}
