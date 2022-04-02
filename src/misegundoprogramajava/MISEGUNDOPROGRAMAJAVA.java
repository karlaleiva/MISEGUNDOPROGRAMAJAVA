/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class MISEGUNDOPROGRAMAJAVA {
    public static void main(String[] args) {
        double cantidadPrestada, tiempo,tasaDeInteres;
        cantidadPrestada = 1500.00;
        tiempo = 0.75;
        tasaDeInteres = 0.08;
        
         double valorInteresSimple = calcularInteresSimple(cantidadPrestada, tiempo, tasaDeInteres);
        System.out.println(" El Interes es :$");
        
    }

    private static double calcularInteresSimple(double cantidadPrestada, double tiempo, double tasaDeInteres){
    double interesSimple;
    interesSimple = cantidadPrestada * tiempo * tasaDeInteres;
    return interesSimple;
    
    }
}
