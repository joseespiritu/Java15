package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Jose", 5000.00, false);
        System.out.println("persona1: " + persona1);
        persona1.setNombre("Jose Luis");
//        System.out.println("persona1 nombre: " + persona1.getNombre());
//        System.out.println("persona1 sueldo: " + persona1.getSueldo());
//        System.out.println("persona1 eliminado: " + persona1.isEliminado());
        
        Persona persona2 = new Persona("Juan", 2000.00, false);
//        System.out.println("persona2 nombre: " + persona2.getNombre());
//        System.out.println("persona2 sueldo: " + persona2.getSueldo());
//        System.out.println("persona2 eliminado: " + persona2.isEliminado());
        System.out.println("persona2: " + persona2);
    }
}
