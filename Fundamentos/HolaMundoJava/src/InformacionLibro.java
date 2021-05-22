// Ejercicio informacion de Libro

import java.util.Scanner;

public class InformacionLibro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el titulo del Libro: ");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor del Libro: ");
        String autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
