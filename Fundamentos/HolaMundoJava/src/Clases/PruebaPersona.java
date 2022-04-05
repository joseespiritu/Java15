package Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Jose";
        persona1.apellido  = "Espiritu";
        
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("Persona1: " + persona1);
        System.out.println("Persona2: " + persona2);
        
        persona2.desplegarInformacion();
        persona2.nombre = "Karla";
        persona2.apellido = "Lara";
        persona2.desplegarInformacion();
    }
}
