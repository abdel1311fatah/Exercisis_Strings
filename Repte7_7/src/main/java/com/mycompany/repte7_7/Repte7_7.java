
package com.mycompany.repte7_7;

import java.util.Scanner;


public class Repte7_7 {

    public static void main(String[] args) {
        Repte7_7 programa = new Repte7_7();
        programa.inici();
    }
    
    public void inici() {
        
    int hores = hores();
    char torn = torn();
    float souBrut = souBrut(hores, torn);
    souNet(souBrut);
        
    }
    
    public int hores(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriu les hores que ha fet a la setmana: ");
        int hores = 0;
        
        if (lector.hasNextInt()) {
            
            hores = lector.nextInt();
            lector.nextLine();
            
        }else{
            
            System.out.println("Lo que has introduit no es correcte");
            lector.next();
          
        }
        
        return hores;
        
    }    
    
    public char torn() {
        Scanner lector = new Scanner(System.in);        
        char torn = 0;
        boolean charcorrecte = false;
        System.out.println("Escriu la primera lletra del torn del treballador: ");
        do{
            
            torn = lector.next().charAt(0);
            
            if((torn == 'M') || (torn == 'T') || (torn == 'N') || (torn == 'm') || (torn == 't') || (torn == 'n')){
                
                charcorrecte = true;
                
            }else{
                
                System.out.println("No has introduit un caracter correcte");
                
            }
            
        }while(charcorrecte == false);

        return torn;
        
    }
    
    public float souBrut(int hores, char torn){
        
        float souBrut = 0;
        
        if ((torn == 'M')||(torn == 'm')){ //mati
            
            System.out.println("Ha treballat de mati, cobrant 5 euros l' hora");
            souBrut = hores * 5;
            
        }else if ((torn == 'T')||(torn == 't')){ //tarda
            
            System.out.println("Ha treballat de tarda, cobrant 6 euros l' hora");
            souBrut = hores * 6;
            
        }else if ((torn == 'N')||(torn == 'n')){ //nit
            
            System.out.println("Ha treballat de nit, cobrant 7.5 euros l' hora");
            souBrut = (float) (hores * 7.5);
            
        }
        
        return souBrut;
        
    }
    
    public void souNet (float souBrut){
        
        float descompte = 0;
        float sounet = 0;
        
        if (souBrut < 1200){
            
            descompte = (float) (souBrut * 0.08);
            
        }else if((souBrut >= 1200) || (souBrut < 2000)){
            
            descompte = (float) (souBrut * 0.10);
            
        }else if(souBrut >= 2000){
            
            descompte = (float) (souBrut * 0.12);
            
        }
        
        sounet = souBrut - descompte;
        System.out.println("El treballador ha de cobrar: " +sounet+ " per lo treballat aquesta setmana");
        
    }
    
}

