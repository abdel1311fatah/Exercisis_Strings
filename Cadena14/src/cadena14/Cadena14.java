
package cadena14;

import java.util.*;

public class Cadena14 {

    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String paraula = "";
        ArrayList<String> paraules = new ArrayList<String>();
        do{
            System.out.println("Escriu una paraula: ");
            paraula = lector.nextLine();
            if (!"fi".equals(paraula)){
                paraules.add(paraula);
                Collections.sort(paraules);
            }
        }while(!"fi".equals(paraula));
        paraula = paraules.get(paraules.size() - 1);
        System.out.println("La paraula que esta mes al final d un diccionari es: " + paraula);
    }
    
}
