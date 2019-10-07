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
        //Declaracion de arreglos
        int aiDatos[] = new int[10];
        System.out.println(aiDatos);
        //N--> # De elenentos
        //0--> 1ER Elemento
        //N1--> Ultimo elemento
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i]= (int) (Math.random()*100)+1;
        }
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.println(aiDatos[i]);
        }
        //For-EACH
        System.out.println("Fore each");
        for (int aiDato : aiDatos) {
            System.out.println(aiDato);
        }
    }
    
}
