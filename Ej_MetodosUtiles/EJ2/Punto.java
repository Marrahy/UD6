package Ej_MetodosUtiles.EJ2;

import java.lang.Math;

public class Punto {
    private int x, y;

    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
    public void imprime() {
        System.out.println("(" + x + "," + y + ")");
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void desplaza(int dx, int dy) {
        x = this.x + dx;
        y = this.y + dy;
    }
    public int distancia(Punto p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return (int)Math.sqrt(dx*dx + dy*dy);
    }
}
