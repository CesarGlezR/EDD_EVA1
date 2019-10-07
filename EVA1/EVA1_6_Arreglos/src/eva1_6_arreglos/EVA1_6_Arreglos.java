/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_arreglos;

/**
 *
 * @author temporal2
 */
public class EVA1_6_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Decloaracion
        int aiDatos[], a, be;
        int[] aiDatos2, x, y ;
        
        int aiCopia[];
        //Inicializacon de arreglo
        int tama =100;
        aiDatos = new int [tama];
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i]=(int) (Math.random()*100)+1;
        }
        System.out.println(aiDatos);
        tama =200;
        aiDatos = new int [tama];
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i]=(int) (Math.random()*100)+1;
        }
        System.out.println(aiDatos);
        //son objetos 
        //La memoria es consecutiva
        //Son de acceso aleatorio
        aiDatos[4]=5000;
        aiDatos[69]=500;
        //Son muy rapidos
        //Son inmutables
    }
    
}
