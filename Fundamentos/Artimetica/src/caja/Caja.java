package caja;

public class Caja {
    
    int ancho;
    int alto;
    int profundo;
    
    public Caja() {
        System.out.println("Ejecutando constructor");
    }
    
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public int calcularVolumenCaja(){
        return this.ancho * this.alto * this.profundo;
    }
    
}
