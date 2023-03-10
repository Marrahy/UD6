package Ej_Setters_Getters.EJ2;

public class Persona {
    private String dni, nombre, apellidos;
    private int  edad;

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
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
}
