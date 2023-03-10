//Sergi Marrahy Arenas

package Ej_MetodosUtiles.EJ1;

import java.util.Scanner;

public class UD6_ProgramaPersona_MetodosUtiles {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Persona show = new Persona();
        System.out.print("Introduce tu DNI: ");
        show.setDni(input.nextLine());

        System.out.print("Introduce tu nombre: ");
        show.setNombre(input.nextLine());

        System.out.print("Introduce tus apellidos: ");
        show.setAppellidos(input.nextLine());

        System.out.print("Introduce tu edad: ");
        show.setEdad(input.nextInt());

        show.imprime();

        Persona getEdad = new Persona();
        System.out.print("Introduce edad 1: ");
        getEdad.setEdad(input.nextInt());

        Persona diffEdad = new Persona();
        System.out.print("Introduce edad 2: ");
        diffEdad.setEdad(input.nextInt());
        
        System.out.println("La diferencia de edad es: " + diffEdad.diferenciaEdad(getEdad));

        input.close();
    }
}
