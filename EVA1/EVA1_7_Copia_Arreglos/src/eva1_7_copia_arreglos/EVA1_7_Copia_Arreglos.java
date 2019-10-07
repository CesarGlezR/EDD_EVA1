/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_7_copia_arreglos;

/**
 *
 * @author temporal2
 */
public class EVA1_7_Copia_Arreglos {

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
        System.out.println("Datos originales");
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.print("["+aiDatos[i]+"]");
        }
        aiCopia=aiDatos;
        System.out.println("\nDatos Copiados");
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.print("["+aiCopia[i]+"]");
        }
    }
    
}
