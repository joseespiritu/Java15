package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        
        // Variables locales
        int a = 10;
        int b = 2;
        miMetodo();
        
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 a:" + aritmetica1.a);
        System.out.println("aritmetica1 b:" + aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 a:" + aritmetica2.a);
        System.out.println("aritmetica2 b:" + aritmetica2.b);
        
//        aritmetica1.a = 3;
//        aritmetica1.b = 2;
//        aritmetica1.sumar();
//        
//        var resultado = aritmetica1.sumarConRetorno();
//        System.out.println("resultado desde la prueba = " + resultado);
//        
//        resultado = aritmetica1.sumarConArgumentos(5, 8);
//        System.out.println("resultado usando argumentos = " + resultado);
    }
    
    public static void miMetodo() {
        // la variable a esta fuera del alcance donde fue definida
        //a = 10;
        System.out.println("otro metodo");
    }
}
