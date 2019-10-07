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
        int aMatriz[][] = new int [3][5];
        
        for (int i = 0; i < aMatriz.length; i++) {//Filas
            for (int j = 0; j < aMatriz[i].length; j++) {//Columnas
                aMatriz[i][j] = (int)(Math.random()*100);
                
            }
            
        }
        //Iprimir ña Matriz
        for (int i = 0; i < aMatriz.length; i++) {//Filas
            
        
            for (int j = 0; j < aMatriz[i].length; j++) {//Columnas
                System.out.print("["+aMatriz[i][j]+"]");
                
            }
            System.out.println("");
    }
    }
    
    
}
