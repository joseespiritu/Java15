package pasoporreferencia;

import Clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "José";
        System.out.println("persona1 nombre: " + persona1.nombre);
        
        persona1 = cambiarValor(persona1);
        System.out.println("persona1 cambio nombre: " + persona1.nombre);
    }
    
    public static Persona cambiarValor(Persona persona){
        if(persona == null) {
            System.out.println("Valor de persona null");
            return persona;
        }
        persona.nombre = "Juan";
        return persona;
    }
}
