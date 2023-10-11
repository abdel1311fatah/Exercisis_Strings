package com.mycompany.repte5_5;

import java.util.Scanner;

public class Repte5_5 
{ 
    Scanner lector = new Scanner(System.in);
    public static void main(String[] args) 
    {
        Repte5_5 programa = new Repte5_5();
        programa.inici();
    }
    
    public void inici()
    {
        mitjana();
        mostrar();
    }
    public int mitjana(){
        int mitjanaNotes = 0, numeroNotes = 0, notesRestants = 5;
        int [] notes = new int [5];
        int c1 = 0;
        do{

            System.out.println("Escriu una nota: ");
            notes [c1] = lector.nextInt();
            System.out.println("Et queden: "+notesRestants+" notes per insertar. ");
            
            if((notes[c1]>=0)&&(notes[c1]<=10)){ 
                
               mitjanaNotes += notes [c1];
               numeroNotes = c1;
               c1++;
               notesRestants--;
               
            }else{
                
                System.out.println("No es una nota valida");
                
            }
            
        }while((notesRestants>0)&&(numeroNotes <= 5));
        
        mitjanaNotes /= numeroNotes;
        System.out.println(mitjanaNotes);
        return mitjanaNotes;
        
    }
    
    public void mostrar()
    {
        System.out.println("La mitjana es: " + mitjana());
    }
    
}
