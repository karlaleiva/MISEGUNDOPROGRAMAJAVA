package misegundoprogramajava;


public class Ejemplo2 {
    public static void main(String[] args) {
        System.out.println("Metodo void");
        metodoConParametroVoid(1, 2434, "Lucas");
        System.out.println("--------------------------------");
        System.out.println("Metodo int");
        metodoConParametroInt(1);
        System.out.println("---------------------------------");
        System.out.println("Metodo double");
        metodoConParametroDouble(24.34);
        System.out.println("---------------------------------");
        System.out.println("Metodo string");
        metodoConParametroString("Lucas");
        
         
    }

    private static void metodoConParametroVoid(int ValorInt, double valorDouble,  String valorString){
      System.out.println("Valor int:" + ValorInt); 
      System.out.println("Valor double:" + valorDouble);
      System.out.println("Valor String"+ valorString); 
    }

    private static void metodoConParametroInt(int ValorInt) {
        System.out.println("El valor int es:" + ValorInt);
      
    }

    private static void metodoConParametroDouble(double valorDouble) {
        System.out.println("El valor double es" + valorDouble);
       
    }

    private static void metodoConParametroString(String valorString) {
        System.out.println("El valor string es" + valorString);
       
    }
    
}

