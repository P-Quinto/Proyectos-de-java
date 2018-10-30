/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pustulio
 */
import java.util.Random;
import java.util.Scanner;

public class Pelea {
    Scanner entrada = new Scanner (System.in);
    String nombre;
    int hp, maxhit, minhit;
    int C;
    
    public String Poder (){
        int opcion;
        C = 1;
        System.out.println("Elija una de las siguientes 3 clases de personaje:");
        System.out.println("1)Soldado/a  2)Hechicero/a  3)Cazador/a");
        opcion = entrada.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Clase elejida: Soldado/a");
                System.out.println("Ventajas: mayor vida, ataques minimos más fuertes");
                hp = 120;
                maxhit = 30;
                minhit = 20;
                C=1;
                break;
                
            case 2:
                System.out.println("Clase elejida: Hechicero/a");
                System.out.println("Ventaja: mayor rango de ataque");
                hp = 90;
                maxhit = 50;
                minhit = 10;
                C=1;
                break;
            case 3:
                System.out.println("Clase elejida: Cazador/a");
                System.out.println("Ventaja: golpe doble");
                hp = 100;
                maxhit = 20;
                minhit = 7;
                C= 2;
                break;
        }
        return null;
    }
    
    public String Nombrar (){
        Scanner ingreso = new Scanner (System.in);
        System.out.println("Ingrese el nombre de su personaje");
        nombre = ingreso.nextLine();
        return "El nombre del personaje es "+nombre;
    }
    
    public static void main (String []args){
        Random azar = new Random(); 
        //Se crean dos personajes
        Pelea PJ1 = new Pelea ();
        PJ1.Poder();
        PJ1.Nombrar();
        Pelea PJ2 = new Pelea ();
        PJ2.Poder();
        PJ2.Nombrar();
        //Se golpean por turnos
        System.out.println("La vida inicial de los combatientes es; "+PJ1.nombre+": "+PJ1.hp+" puntos de vida. Y "+PJ2.nombre+": "+PJ2.hp+" puntos de vida");
        int turno=1;
        do {
            System.out.println("Turno "+turno+".");
            //Golpea el pj 1
            int golpe1 = azar.nextInt((PJ1.maxhit-PJ1.minhit));
            golpe1 = PJ1.minhit + golpe1;
            if (PJ1.C > 1) {
                golpe1= golpe1*2;
            }
            PJ2.hp= PJ2.hp-golpe1;
            System.out.println(PJ1.nombre+" golpea a "+PJ2.nombre+" y le deja en "+PJ2.hp+" puntos de vida.");
            
            //Golpea el pj 2
            int golpe2 = azar.nextInt((PJ2.maxhit-PJ2.minhit));
            golpe2 = PJ2.minhit + golpe2;
            if (PJ2.C > 1) {
                golpe2= golpe2*2;
            }
            PJ1.hp= PJ1.hp-golpe2;
            System.out.println(PJ2.nombre+" golpea a "+PJ1.nombre+" y le deja en "+PJ1.hp+" puntos de vida.");
            turno++;
        } while (PJ1.hp>0 && PJ2.hp>0);
        
        //Alguno/a mata al otro/a
        if (PJ1.hp>0 && PJ2.hp<=0){
            System.out.println(PJ1.nombre+" mató a "+PJ2.nombre+". Ganó el combate.");
        }
        else {
            if (PJ1.hp<=0 && PJ2.hp>0){
                System.out.println(PJ2.nombre+" mató a "+PJ1.nombre+". Ganó el combate.");
                }
            else {
                System.out.println("Los combatientes se mataron mutuamente. Resultado: empate.");
            }
        }
}
}

        


