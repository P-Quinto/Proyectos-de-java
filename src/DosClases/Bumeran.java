/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DosClases;

/**
 *
 * @author Pustulio
 */
public class Bumeran {
    float peso, radio, distancia;
    String material, dificultad;
    
    
    public void pesar (float peso){
        this.peso = peso;
    }
    public void medir (float radio){
        this.radio = radio;
    }
    public void DistVuelo (float distancia){
        this.distancia = distancia;
    }
    public void ObtenMaterial (String material){
        this.material = material;
    }
    public void ObtenDificultad (String dificultad){
        this.dificultad = dificultad;
    }    
    public void Ficha (){
        System.out.println("Este búmeran pesa: "+peso+" kg,");
        System.out.println("mide "+radio+" cm de radio,");
        System.out.println("vuela "+distancia+" metros aproximadamente,");
        System.out.println("está hecho de "+material);
        System.out.println("y su dificultad de tiro es "+dificultad);        
    }

    
}
