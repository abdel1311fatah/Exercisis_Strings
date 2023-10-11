package cadena4;

import java.util.Scanner;

import static java.lang.Character.isDigit;

    public class Cadena4 {

        public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            String DNI = "";
            boolean valid = false;
            int cnumeros = 0;
            System.out.println("Escriu un DNI: ");
            DNI = lector.nextLine();
            if (DNI.length() == 9) {
                for ( int c1 = 0; c1 <= 7; c1++){
                    valid = isDigit(DNI.charAt(c1));
                    if (valid){
                        cnumeros++;
                    }
                }
                char lletra = (DNI.charAt(8));
                valid = Character.isLetter(lletra);
                if ((valid)&& (cnumeros == 8)){
                    System.out.println(DNI + " es un DNI valid ");
                } else {
                    System.out.println(DNI + " no es un DNI valid");
                }
            } else {
                System.out.println("El DNI no te 9 caracters");
            }
                
        }

    }
