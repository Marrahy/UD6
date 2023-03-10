package Ej_MetodosUtiles.EJ2;

public class UD6_ProgramaPunto_MetodosUtiles {
    public static void main(String[] args) {
        
        Punto show = new Punto();
        show.setX(2);
        show.setY(6);
        show.imprime();

        Punto _setXY = new Punto();
        _setXY.setXY(5, 1);
        _setXY.imprime();

        Punto moverCoordenadas = new Punto();
        moverCoordenadas.setXY(1, 0);
        moverCoordenadas.desplaza(2, 3);
        moverCoordenadas.imprime();

        Punto coordenadas1 = new Punto();
        coordenadas1.setXY(4, 7);

        Punto coordenadas2 = new Punto();
        coordenadas2.setXY(5, 1);

        int calcDistancia = coordenadas1.distancia(coordenadas2);
        System.out.println(calcDistancia);
    }
}