/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema7;
import java.util.*;
/**
 *
 * @author jaime
 */
public class Problema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float km,o;
       km=solicitarDato();   //se solicita dato
       o=operacion(km);
       mensajeSalida();  
    }
    public static float solicitarDato(){
        float km;
        Scanner teclado= new Scanner (System.in);
        System.out.println("Introduce los Km/hr para convertirlos a m/s: ");
        km=teclado.nextInt();
        return km;
       
    }
    public static float operacion(float km){
    float r;             //se hace la operacion
    r= (float) ((km*1000)/3600);
    System.out.println(km + " es igual a: " + r);
    return r;
}
    public static void mensajeSalida(){
        System.out.println("Gracias por usar el programa"); //se agradece
        System.exit(0);//Sale del programa
}
}
