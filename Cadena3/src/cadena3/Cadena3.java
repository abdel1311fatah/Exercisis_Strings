package cadena3;

public class Cadena3 {

    
    public static void main(String[] args) {
        String frase = "Mañana es sabado  y voy a ir cenar con los amigos por la zona de marcha de Logroño";
        int a = 0, o = 0, e = 0;
        for (int c1 = 0; c1 < frase.length(); c1++){
            char x = frase.charAt(c1);
            if (x == 'a'){
                a++;
            }
            if (x == 'o'){
                o++;
            }
            if (x == 'e'){
                e++;
            }
        }
        System.out.println("Hi han " + a + " lletres 'a'");
        System.out.println("Hi han " + o + " lletres 'o'");
        System.out.println("Hi han " + e + " lletres 'e'");
        if (a > 10){
            System.out.println("Exceso de 'a'");
        }
        if (o > 5){
            System.out.println("Exceso de 'o'");
        }
        if (e > 3){
            System.out.println("Exceso de 'e'");
        }
    }
    
}
