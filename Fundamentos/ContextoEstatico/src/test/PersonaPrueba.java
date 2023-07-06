package test;

import domain.Persona;

public class PersonaPrueba {
    
//    Un elemento estatico NO puede acceder a un elemento dinámico
//    Un elemento dinamico SI puede acceder a un elemento estatico
    
    private int contador;
    
    static public void main(String[] args) {
        Persona persona1 = new Persona("Jose");
        Persona persona2 = new Persona("Juan");
        
        imprimir(persona1);
        imprimir(persona2);
    }
    
    static public void imprimir(Persona persona) {
        System.out.println("persona = " + persona);
    }
    
    public int getContador() {
        imprimir(new Persona("Jose2"));
        return this.contador;
    }
}
