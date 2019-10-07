/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_copia_arreglos2;

/**
 *
 * @author temporal2
 */
public class EVA1_8_Copia_Arreglos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Decloaracion
        int aiDatos[];
        int aiCopia[] = new int[10];
        //Inicializacon de arreglo
        aiDatos = new int [10];
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i]=(int) (Math.random()*100)+1;
        }
        for (int i = 0; i < aiDatos.length; i++) {
            aiCopia[i]= aiDatos[i];
        }
        imprimirArreglo(aiDatos);
        imprimirArreglo(aiCopia);
        System.out.println(aiDatos);
        System.out.println(aiCopia);
        aiDatos[0]= 99999;
        imprimirArreglo(aiDatos);
        imprimirArreglo(aiCopia);
        
    }
    public static void imprimirArreglo(int[] args){
        System.out.println("");
        for (int i = 0; i < args.length; i++) {
            System.out.print("["+args[i]+"]");
        }
        System.out.println("");
    }
    
}
