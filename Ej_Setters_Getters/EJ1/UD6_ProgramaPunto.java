package Ej_Setters_Getters.EJ1;

public class UD6_ProgramaPunto {
    public static void main(String[] args) {
        
        Punto punto1 = new Punto();
        punto1.setX(5);
        punto1.setY(0);

        int punto1_X = punto1.getX();
        int punto1_Y = punto1.getY();

        System.out.println(punto1_X + " " + punto1_Y);

        Punto punto2 = new Punto();
        punto2.setX(10);
        punto2.setY(10);

        int punto2_X = punto2.getX();
        int punto2_Y = punto2.getY();

        System.out.println(punto2_X + " " + punto2_Y);

        Punto punto3 = new Punto();

        punto3.setX(-3);
        punto3.setY(7);

        int punto3_X = punto3.getX();
        int punto3_Y = punto3.getY();

        System.out.println(punto3_X + " " + punto3_Y);
    }
}
