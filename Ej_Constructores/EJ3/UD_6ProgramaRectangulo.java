package EJ3;
//CONSTRUCOR Sergi Marrahy Arenas
public class UD_6ProgramaRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(0, 0, 5, 5);
        int perimetro_rectangulo1 = rectangulo1.x1 + rectangulo1.y1 + rectangulo1.x2 + rectangulo1.y2;
        int area_rectangulo1 = rectangulo1.x1 + rectangulo1.x2 * rectangulo1.y1 + rectangulo1.y2;

        System.out.println("Coordenadas (en cm): ");
        System.out.println("x1: " + rectangulo1.x1);
        System.out.println("y1: " + rectangulo1.y1);
        System.out.println("x2: " + rectangulo1.x2);
        System.out.println("y2: " + rectangulo1.y2);
        System.out.println();
        System.out.println("Perímetro de rectangulo 1: " + perimetro_rectangulo1 + "cm");
        System.out.println("Área del recántgulo 1: " + area_rectangulo1 + "cm");

        System.out.println();
        
        Rectangulo rectangulo2 = new Rectangulo(7, 9, 2, 3);
        int perimetro_rectangulo2 = rectangulo2.x1 + rectangulo2.y1 + rectangulo2.x2 + rectangulo2.y2;
        int area_rectangulo2 = rectangulo2.x1 + rectangulo2.x2 * rectangulo2.y1 + rectangulo2.y2;

        System.out.println("Coordenadas (en cm): ");
        System.out.println("x1: " + rectangulo2.x1);
        System.out.println("y1: " + rectangulo2.y1);
        System.out.println("x2: " + rectangulo2.x2);
        System.out.println("y2: " + rectangulo2.y2);
        System.out.println();
        System.out.println("Perímetro de rectangulo 1: " + perimetro_rectangulo2 + "cm");
        System.out.println("Área del recántgulo 1: " + area_rectangulo2 + "cm");
    }
}