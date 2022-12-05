package reverseString;


public class Main {
    public static void main(String[] args) {
        String frase = "Hola Mundo";
        System.out.println(reverse(frase));
    }

    public static String reverse (String texto){
        String frase = "";
        for ( int i = texto.length() -1  ; i >=0 ; i--) {
            frase = frase + texto.charAt(i);
        }
        return frase;
    }
}

