/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaleatorios;

import java.util.Random;
/**
 *
 * @author POCYX
 */
public class Dados {
    private static int puntos;
    static int puntos1=0;
    static int puntos2=0;
    static int puntos3=0;
    static int[] dado = new int[3];
    static int[] pun = new int[3];
    private static Random generador = new Random();
    
    
    /**
     *Constructor
     * Tres dados y seis caras aleatorias por cada uno.
     */
    public Dados() {
        dado = new int[3];
        dado[0]=(int)(generador.nextInt(6) + 1);
        dado[1]=(int)(generador.nextInt(6) + 1);
        dado[2]=(int)(generador.nextInt(6) + 1);
    }
    
    /**
     *
     * @return puntos
     */
    public int getPuntos() {
      return puntos;
   }

    /**
     *
     * @param puntos estos puntos
     */
    public void setPuntos(int puntos) {
      this.puntos = puntos;
   }  
    
    public static int puntuacion2(){
        pun = new int[3];
        pun[0]=(int)(generador.nextInt(6) + 1);
        pun[1]=(int)(generador.nextInt(6) + 1);
        pun[2]=(int)(generador.nextInt(6) + 1);
        for(int i=0;i<pun.length;i++){
            for(int p: dado){
                if(p==1) pun[i]=100;
                else if(p==6) pun[i]=60;
                else pun[i]=p;
            }
        }
        puntos = pun[0]+pun[1]+pun[2];
        System.out.println("PUNTOS--> "+puntos);
        return puntos;
    }
    
    public static int puntuacion(){
        pun = new int[3];
        pun[0]=(int)(generador.nextInt(6) + 1);
        pun[1]=(int)(generador.nextInt(6) + 1);
        pun[2]=(int)(generador.nextInt(6) + 1);
        
        puntos = pun[0]+pun[1]+pun[2];
        System.out.println("Dado1--> "+pun[0]+", Dado2--> "+pun[1]+", Dado3--> "+pun[2]);
        System.out.println("La suma de los tres dados es: ");
        System.out.println("PUNTOS--> "+puntos);
        return puntos;
    }
}
