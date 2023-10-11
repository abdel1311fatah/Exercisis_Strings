package cadena2;


public class Cadena2 {

    
    public static void main(String[] args) {
        String frase = "Mañana es sabado  y voy a ir cenar con los amigos por la zona de marcha de Logroño";
        int a = 0;
        for (int c1 = 0; c1 < frase.length(); c1++){
            char x = frase.charAt(c1);
            if (x == 'a'){
                a++;
            }
        }
        System.out.println("Hi han " + a + " lletres 'a'");
    }
    
}
