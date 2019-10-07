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
        int aMatriz [][][][][] = new int [5][3][8][10][11];
        for (int i = 0; i < aMatriz.length; i++) {//Filas
            for (int j = 0; j < aMatriz[i].length; j++) {//Columnas
                
                
                    for (int k = 0; k < aMatriz[i][j].length; k++) {//Columnas
                     
                        for (int l = 0; l < aMatriz[i][j][k].length; l++) {//Columnas
                        
                
                            for (int m = 0; m < aMatriz[i][j][k][l].length; m++) {//Columnas
                            aMatriz[i][j][k][l][m] = (int)(Math.random()*100);
                
            }
    }
    
}
            }
        }
        for (int i = 0; i < aMatriz.length; i++) {//Filas
            for (int j = 0; j < aMatriz[i].length; j++) {//Columnas
                
                
                    for (int k = 0; k < aMatriz[i][j].length; k++) {//Columnas
                     
                        for (int l = 0; l < aMatriz[i][j][k].length; l++) {//Columnas
                        
                
                            for (int m = 0; m < aMatriz[i][j][k][l].length; m++) {//Columnas
                            System.out.print("["+aMatriz[i][j][k][l][m]+"]");
                
            }
                            System.out.println("");
    }
    
}
            }
        }
        
        
    }
}