

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pustulio
 */
import java.util.Scanner;


public class Personaje { //el PJ será el objeto
    int hp, fuerza, agi, inte;
    String nombre, clase;
    
    public String Llamar (){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese el nombre del PJ: ");
        nombre = entrada.nextLine();
        return "El nombre del PJ es " + nombre;        
        }
    
    public String Stats (){
        Scanner entrada = new Scanner (System.in);
        int puntos = 0;
        while (puntos != 14) {
            System.out.println("Distribuya 14 puntos entre las características de su PJ: Fuerza, agilidad, inteligencia y vida");
            System.out.println("Ingrese un valor de fuerza");
            fuerza = entrada.nextInt();
            System.out.println("Ingrese un valor de agilidad");
            agi = entrada.nextInt();
            System.out.println("Ingrese un valor de inteligencia");
            inte = entrada.nextInt();
            System.out.println("Ingrese un valor de vida");
            hp = entrada.nextInt();
            puntos = fuerza+agi+inte+hp;
            System.out.println("La cantidad de puntos usada es de: "+puntos+" puntos.");
            }
        return "fuerza: "+fuerza+", agilidad: "+agi+", inteligencia: "+inte+", y vida: "+hp;
        } 
    
//fin del proceso de conseguir Stats
    
    public String Clase (){
        Scanner entrada = new Scanner (System.in);
        int opcion = 0;
        boolean C;
        C = false;
        
        if (fuerza >= 4) {
            System.out.println("El personaje puede ser 1-guerrero");
        }
        if (agi >= 4) {
            System.out.println("El personaje puede ser 2-ladrón");
        }
        if (inte >= 4){
            System.out.println("El personaje puede ser 3-mago");
        }
        if (hp >= 5){
            System.out.println("El personaje puede ser 4-paladín");
        }
        while (C!=true) {
        System.out.println("Ingrese el número de la clase correspondiente. En caso de poder más de uno, elija uno");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                if (fuerza >= 4){
                    clase= "guerrero";
                    C = true;
                }
                else {
                    System.out.println(nombre+" no tiene suficiente fuerza. Elija otra clase");
                    C = false;
                }  
                break;
            case 2:
                if (agi >= 4){
                    clase= "ladrón";
                    C = true;
                }
                else {
                    System.out.println(nombre+" no tiene suficiente agilidad. Elija otra clase");
                    C = false;
                }  
                break;
            case 3:
                if (inte >= 4){
                    clase= "mago";
                    C = true;
                }
                else {
                    System.out.println(nombre+" no tiene suficiente inteligencia. Elija otra clase");
                    C = false;
                }  
                break;
            case 4:
                if (hp >= 4){
                    clase= "paladín";
                    C = true;
                }
                else {
                    System.out.println(nombre+" no tiene suficiente vida. Elija otra clase");
                    C = false;
                }  
                break;
        }
        }
        
        return "El personaje "+nombre+" es "+clase;
    } 
    
//fin de la obtención de clase

    public static void main (String [] args){
        //Nuevo PJ
        Personaje PJ1 = new Personaje ();
        System.out.println(PJ1.Llamar()+", sus características son "+PJ1.Stats()+" "+PJ1.Clase());
        
    }


    
    
}
