package Ej_MetodosUtiles.EJ1;

public class Persona {
    private String dni, nombre, appellidos;
    private int edad;

    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getDni() {
        return dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setAppellidos(String appellidos) {
        this.appellidos = appellidos;
    }
    public String getAppellidos() {
        return appellidos;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    public void imprime() {
        if (esMayordeEdad() && !esJubilado())
            System.out.println(nombre + " " + appellidos + " con DNI: " + dni + " es mayor de edad");
        else {
            if (esJubilado())
                System.out.println(nombre + " " + appellidos + " con DNI: " + dni + " es jubilado");
            else
                System.out.println(nombre + " " + appellidos + " con DNI: " + dni + " es menor de edad");
        }
    }
    public boolean esMayordeEdad() {
        if (edad >= 18 && edad <= 65)
            return true;
        else
            return false;
    }
    public boolean esJubilado() {
        if (edad >= 65)
            return true;
        else
            return false;
    }
    public int diferenciaEdad(Persona p) {
        int diffEdad = this.edad - p.edad;
            return Math.abs(diffEdad);
    }
}
