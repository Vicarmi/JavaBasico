package ArrayLista;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static <Int> void main(String[] args) {

        // ArrayList de strings

        ArrayList<String> arrayLista = new ArrayList<>();

        arrayLista.add("Vicente");
        arrayLista.add("Carlon");
        arrayLista.add("Miguel");
        arrayLista.add("...Soy yo...");

        LinkedList<String> linkedLista = new LinkedList<>();

        for (String elemento : arrayLista) {
            linkedLista.add(elemento);
        }

        System.out.println("\n IMPRIME ARRAYLIST \n");
        for (String elemento : arrayLista) {
            System.out.println(elemento);
        }
        System.out.println("\n IMPRIME LINKEDLIST \n");
        for (String elemento : linkedLista) {
            System.out.println(elemento);
        }

        imprimirLinea(arrayLista);
        imprimirLinea(linkedLista);


        // ARRAYLIST DE NUMEROS

        System.out.println( "\n**************************************\n");
        System.out.println(   "*****    ARRAYLIST DE ENTEROS    *****");
        System.out.println( "\n**************************************\n");

        ArrayList<Integer> listaEnteros = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            listaEnteros.add(i, i + 1);
        }
        System.out.println(listaEnteros);


        for (int i = 0; i < listaEnteros.size(); i++) {
            if (listaEnteros.get(i) % 2 == 0) { // es par
                listaEnteros.remove(i);
            }
        }
        System.out.println(listaEnteros);
    }
    public static void imprimirLinea(List<String> lista){
        String nombreCompleto = "";
        for (String elemento : lista){
            nombreCompleto = nombreCompleto + elemento + " ";
        }
        System.out.println("\n");
        System.out.println(nombreCompleto);

    }
}
