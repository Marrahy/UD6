package EJ2;

import java.util.Scanner;

public class UD6_ProgramaPersona {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Introduce tu DNI: ");
        String dni = input.nextLine();

        System.out.print("Introduce tu nombre: ");
        String nombre = input.nextLine();

        System.out.print("Introduce tu apellido: ");
        String apellidos = input.nextLine();

        System.out.print("Introduce tu edad: ");
        int edad = input.nextInt();

        Persona persona1 = new Persona(dni, nombre, apellidos, edad);

        input.nextLine();

        System.out.print(persona1.nombre + " ");
        System.out.print(persona1.apellidos + " con DNI ");
        System.out.print(persona1.dni);

        if (persona1.edad >= 18)
            System.out.print(" es mayor de edad.");
        else
            System.out.print(" no es mayor de edad.");

        System.out.println();
        
        System.out.print("Introduce tu DNI: ");
        dni = input.nextLine();

        System.out.print("Introduce tu nombre: ");
        nombre = input.nextLine();

        System.out.print("Introduce tu apellido: ");
        apellidos = input.nextLine();

        System.out.print("Introduce tu edad: ");
        edad = input.nextInt();

        Persona persona2 = new Persona(dni, nombre, apellidos, edad);

        System.out.print(persona2.nombre + " ");
        System.out.print(persona2.apellidos + " con DNI ");
        System.out.print(persona2.dni);

        if (persona2.edad >= 18)
            System.out.print(" es mayor de edad.");
        else
            System.out.print(" no es mayor de edad.");

        input.close();
    }
}
