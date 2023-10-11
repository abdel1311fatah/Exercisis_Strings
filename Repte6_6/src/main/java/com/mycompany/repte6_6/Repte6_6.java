package com.mycompany.repte6_6;

import java.util.Scanner;
import java.util.Random;

public class Repte6_6 {

    public static void main(String[] args) {
        Repte6_6 programa = new Repte6_6();
        programa.inici();
    }
    
    public void inici() {
        
        int numero = introduir();
        filtrar(numero);
        
    }
    
    public int introduir(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriu un numero: ");
        int numero = 0;
        
        if (lector.hasNextInt()) {
            
            numero = lector.nextInt();
            lector.nextLine();
            
        }else{
            
            System.out.println("El numero que has introduit no es correcte");
            lector.next();
          
        }
        return numero;
    }
    
    public void filtrar(int numero){
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Fins a quant vols que arribin els numeros?");
        int maxims = lector.nextInt();
        int repetits = 0;
        int [] random = new int [maxims];
        System.out.println("Aqui estan els numeros del array que han sigut generats aleatoriament \n");
        for(int c1 = 0; c1 <= maxims-1;c1++){
            Random rand = new Random(); 
            random [c1] = rand.nextInt(maxims);
            System.out.println(random[c1]);
            if(random[c1] == numero){
                repetits++;
            }
        }
        System.out.println("\n Hi han "+repetits+ " numeros repetits");
    }    
    
}
