package caja;

public class PruebaCaja {
    
    public static void main(String[] args) {
        
        int ancho = 3;
        int alto = 2;
        int profundo = 6;
        
        Caja volumenCajaSinArgs = new Caja();
        volumenCajaSinArgs.ancho = ancho;
        volumenCajaSinArgs.alto = alto;
        volumenCajaSinArgs.profundo = profundo;
        int resultado = volumenCajaSinArgs.calcularVolumenCaja();
        System.out.println("El volumen de la caja es: " + resultado);
        
        Caja volumenCaja = new Caja(ancho, alto, profundo);
        System.out.println("El volumen de la caja es: " + volumenCaja.calcularVolumenCaja());
        
    }
    
}
