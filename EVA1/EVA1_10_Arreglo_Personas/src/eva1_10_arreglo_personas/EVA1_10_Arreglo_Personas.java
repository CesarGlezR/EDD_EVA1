/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_arreglo_personas;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA1_10_Arreglo_Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Read = new Scanner(System.in);
        Persona[] apArreglo= new Persona[10];
        Persona[] apCopia = new Persona[10];
        
        for (int i = 0; i < apArreglo.length; i++) {
            apArreglo[i]= new Persona();
            System.out.println("Inroduce tu nombre "+i);
            apArreglo[i].sN = Read.nextLine();
            System.out.println("Inroduce tu Apellido "+i);
            apArreglo[i].sA = Read.nextLine();
        }
        for (int i = 0; i < apArreglo.length; i++) {
            apCopia[i] = new Persona();
            apCopia[i].sN= apArreglo[i].sN;
            apCopia[i].sA= apArreglo[i].sA;
            System.out.println("Nombre Original: "+i+"="+apArreglo[i].sN);
            System.out.println("Nombre Copia: "+i+"="+apCopia[i].sN);
            System.out.println("Apellido Original: "+i+"="+apArreglo[i].sA);
            System.out.println("Apellido Copia: "+i+"="+apCopia[i].sA);
            System.out.println("Direccion Original: "+i+"="+apArreglo[i]);
            System.out.println("Direccion Copia: "+i+"="+apCopia[i]);
        }
    }
    
}
class Persona{
    String sN,sA;
}