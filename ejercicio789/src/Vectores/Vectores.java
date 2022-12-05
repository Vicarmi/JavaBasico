package Vectores;

import java.util.Vector;

public class Vectores {

    public static void main(String[] args) {

        Vector<String> vectorStrings = new Vector <String>(10, 5);

        vectorStrings.add("Vicente");
        vectorStrings.add("Carlon");
        vectorStrings.add("Miguel");
        vectorStrings.add("Villadoniga");
        vectorStrings.add("Diaz");

        imprimirVector(vectorStrings);

        // borrando elementos del vector

        vectorStrings.remove(2);
        vectorStrings.remove(3);

        imprimirVector(vectorStrings);

        vectorStrings.add("Juan");

        imprimirVector(vectorStrings);

        System.out.println( "\n**************************************\n");
        System.out.println(" Problema : que si necesitaramos alguno mas, el uso de memoria sería alo al extenderlo");
        System.out.println( "\n**************************************\n");

    }

    public static void imprimirVector ( Vector<String> vectorStrings) {

        System.out.println( "\n**************************************\n");

        // imprime vector diretamente

        System.out.println(vectorStrings);

        System.out.println( "\n**************************************\n");


        // imprime vector con for

        for (String nombre : vectorStrings){
            System.out.println(nombre + " ");
        }

        System.out.println( "\n**************************************\n");


        // imprime vector seguido como string
        String nombreCompleto = "";
        for ( int i = 0 ;i < vectorStrings.size() ; i++){
            nombreCompleto = nombreCompleto + vectorStrings.get(i) + " " ;
        }
        System.out.println(nombreCompleto);

        System.out.println( "\n**************************************\n");
    }
}
