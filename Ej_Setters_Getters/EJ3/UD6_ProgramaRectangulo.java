package Ej_Setters_Getters;

public class UD6_ProgramaRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();

        rectangulo1.setX1(0);
        rectangulo1.setY1(0);
        rectangulo1.setX2(5);
        rectangulo1.setY2(5);

        int rectangulo1_X1 = rectangulo1.getX1();
        int rectangulo1_Y1 = rectangulo1.getY1();
        int rectangulo1_X2 = rectangulo1.getX2();
        int rectangulo1_Y2 = rectangulo1.getY2();

        if (rectangulo1_X2 < rectangulo1_X1 && rectangulo1_Y2 < rectangulo1_Y1) {
            System.out.println();
            System.out.println("Rectángulo 1:");
            System.out.println("ERROR al instanciar los valores del rectángulo");
        }
        else {
            System.out.println("Rectángulo 1:");
            System.out.println(rectangulo1_X1 + " " + rectangulo1_Y1);
            System.out.println(rectangulo1_X2 + " " + rectangulo1_Y2);
        }

        Rectangulo rectangulo2 = new Rectangulo();

        rectangulo2.setX1(7);
        rectangulo2.setY1(9);
        rectangulo2.setX2(2);
        rectangulo2.setY2(3);

        int rectangulo2_X1 = rectangulo2.getX1();
        int rectangulo2_Y1 = rectangulo2.getY1();
        int rectangulo2_X2 = rectangulo2.getX2();
        int rectangulo2_Y2 = rectangulo2.getY2();

        if (rectangulo2_X2 < rectangulo2_X1 && rectangulo2_Y2 < rectangulo2_Y1) {
            System.out.println();
            System.out.println("Rectángulo 2:");
            System.out.println("ERROR al instanciar los valores del rectángulo");
        }
        else {
            System.out.println("Rectángulo 2:");
            System.out.println(rectangulo2_X1 + " " + rectangulo2_Y1);
            System.out.println(rectangulo2_X2 + " " + rectangulo2_Y2);
        }
    }   
}
