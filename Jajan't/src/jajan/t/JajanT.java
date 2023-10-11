//abel
package jajan.t;

import java.util.Scanner;


public class JajanT {

   
    public static void main(String[] args) {
      int diagonal[][] = diagonal= new int [5][5]; 
  
        for (int i=0;i<diagonal.length;i++){
            for (int j=0;j<diagonal.length;j++){ 
                if (i == 1 || j == 2 ){ //creu cristiana
                    diagonal[i][j] = 1; 
                }
            }
        }
        for (int i=0;i<diagonal.length;i++){
            for (int j=0;j<diagonal.length;j++){ 
                System.out.print(" "+diagonal[i][j]);
            }
            System.out.println(" ");
        }   
    }
    
}