/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aArreglo[]= new int [10];
        System.out.println(aArreglo);
        llenarArreglo(aArreglo);
        madrearArreglo(aArreglo);
        System.out.println(aArreglo);
        imprimirArreglo(aArreglo);
        
    }
    public static void llenarArreglo(int[] args){
        for (int i = 0; i < args.length; i++) {
            args[i]= (int)(Math.random()*100);
        }
        System.out.println(args);
    }
    public static void madrearArreglo(int[] args){
        args= new int[100];
        System.out.println(args);
    }
    public static void imprimirArreglo(int[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.print("["+args[i]+"]");
        }
        System.out.println("");
    }
    
}
