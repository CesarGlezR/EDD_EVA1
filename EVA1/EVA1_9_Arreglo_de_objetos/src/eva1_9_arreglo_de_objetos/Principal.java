/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_9_arreglo_de_objetos;

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba[] apArreglo = new Prueba[5];
        System.out.println(apArreglo);
        for (int i = 0; i < apArreglo.length; i++) {
            apArreglo[i]=new Prueba();
            apArreglo[i].x= (int)(Math.random()*100);
            System.out.println(apArreglo[i]);
        }
        Prueba[] apCopia = new Prueba[5];
        for (int i = 0; i < apArreglo.length; i++) {
            apCopia[i] = new Prueba();
            apCopia[i].x= apArreglo[i].x;
            System.out.println("Copia "+i+"="+apCopia[i]);
            System.out.println("Arreglo "+i+"="+apArreglo[i]);
        }
    }

}
class Prueba{
    int x;
}