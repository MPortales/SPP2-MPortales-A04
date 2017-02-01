/*Maythe Portales Barrios. A01411461
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mportales.a04;
import java.util.Scanner;
/**
 *
 * @author may37
 */
public class SPP2MPortalesA04 {
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           //teclado
        Scanner teclado= new Scanner (System.in);
//variables
        double angulo = 0, resultado;
        int opEntrada;
//menu
            System.out.println("CALCULADORA DE TANGENTE, SENO Y COSENO");
            System.out.println("Introduce el numero de la opcion que desees");
            System.out.println("1- Calcular Tangente");
            System.out.println("2- Calcular Seno");
            System.out.println("3- Calcular Coseno");
            System.out.println("4- Salir");
            opEntrada = teclado.nextInt();
                
        switch (opEntrada){
            case 1:
                System.out.println("Calculadora de Tangete");
                //llamar al metodo
                //guardarlo en la variable angulo
                angulo = pedirangulo();
                resultado = Math.tan(angulo);
                System.out.println("La tangente es " +resultado);
                break;
            case 2:
                System.out.println("Calculadora de Seno");
                angulo = pedirangulo();
                resultado =Math.sin(angulo);
                System.out.println("El seno es " +resultado);
                break;
            case 3:
                System.out.println("Calculadora de Coseno");
                angulo = pedirangulo();
                resultado =Math.cos(angulo);
                System.out.println("El coseno es " +resultado);
                break;
            default:
                System.out.println("Gracias");
        }
    }
    
    static double pedirangulo (){
        double angulo;
        Scanner teclado =new Scanner (System.in);
        System.out.println("Introduce el angulo");
        angulo= teclado.nextDouble();
        return angulo;
    }
}