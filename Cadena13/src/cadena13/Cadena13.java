
package cadena13;

import java.util.Scanner;


public class Cadena13 {

   
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriu una frase: ");
        String frase = lector.nextLine();
        int posicio = 0;
        String [] retallada = frase.split(" ");
        for (int c1 = 0; c1 <= frase.length(); c1++){
            posicio ++;
            if (posicio % 2 != 0){
                System.out.println(retallada[c1]); 
            }
        }
       
    }
    
}
