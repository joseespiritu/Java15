package operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //Metodo
    public void sumar() {
       int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
//        int resultado = a + b;
//        return resultado;
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2) {
        this.a = arg1;
        this.b = arg2;
        //return a + b ;
        return sumarConRetorno();
    }
}