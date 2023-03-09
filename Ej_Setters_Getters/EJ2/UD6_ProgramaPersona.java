package Ej_Setters_Getters;

import java.util.Scanner;

public class UD6_ProgramaPersona {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        System.out.print("Introduce tu DNI: ");
        persona1.setDni(input.nextLine());
        String persona1Dni = persona1.getDni();

        System.out.print("Introduce tu nombre: ");
        persona1.setNombre(input.nextLine());
        String persona1Nombre = persona1.getNombre();

        System.out.print("Introduce tus apellidos: ");
        persona1.setApellidos(input.nextLine());
        String persona1Apellidos = persona1.getApellidos();

        System.out.print("Introduce tu edad: ");
        persona1.setEdad(input.nextInt());
        int persona1Edad = persona1.getEdad();

        if (persona1Edad >= 18)
            System.out.println(persona1Nombre + persona1Apellidos + " con dni " + persona1Dni + " es mayor de edad.");
        else
            System.out.println(persona1Nombre + persona1Apellidos + " con dni " + persona1Dni + " no es mayor de edad.");
    }
}
