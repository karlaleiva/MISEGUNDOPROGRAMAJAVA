package misegundoprogramajava;

import java.io.BufferedReader;
import java.io.InputStreamReader;





public class Ejemplo4 {
    public static void main(String[] args) {
        double cantidad1=0,cantidad2=0;
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Ingrese cantidad 1:");
             cantidad1 = Double.parseDouble( leer.readLine());
             System.out.println("Ingrese cantidad 2:");
             cantidad2 = Double.parseDouble( leer.readLine ());
             
             System.out.println("El resultado de la suma es" + Ejemplo4.sumar(cantidad1,cantidad2));
             System.out.println("El resultado de la resta es" + Ejemplo4.restar(cantidad1,cantidad2));
             System.out.println("El resultado de la multiplicacion es :" + Ejemplo4.multiplicar(cantidad1,cantidad2));
             System.out.println("El resultado de la multi´plicacion es :" + Ejemplo4.division(cantidad1,cantidad2));

        
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(cantidad1 +""+ cantidad2);
    }

    private static double sumar(double cantidad1, double cantidad2) {
        double suma =cantidad1 + cantidad2;
        return suma;
    }

    private static double restar(double cantidad1, double cantidad2) {
        double resta =cantidad1 - cantidad2;
        return resta;
    }

    private static double multiplicar(double cantidad1, double cantidad2) {
        double multiplicar =cantidad1 * cantidad2;
        return multiplicar;
    }

    private static double division(double cantidad1, double cantidad2) {
     double dividision =cantidad1 * cantidad2;
        return dividision;
    }

    
}
