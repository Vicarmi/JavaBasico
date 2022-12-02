package es.vicarmi.estructurasControl;

public class concatenarString {

    public static void main(String[] args) {

        String[] nombres = {"Vicente" , "Carlon" , "Miguel", "Villadoniga" , "Diaz"};
        String nombreCompleto = "";

        // con bucle for

        for (int i = 0 ; i < nombres.length ; i++){
            nombreCompleto += nombres[i] + " ";
        }
        imprimirCadena(nombreCompleto);

        // con bucle ForEach //
        nombreCompleto = "";
        for (String nombre : nombres){
            nombreCompleto += nombre + "-";
        }

        imprimirCadena(nombreCompleto);


        // con forEach y concat

        nombreCompleto = "";
        for (String nombre : nombres){
            nombreCompleto = nombreCompleto.concat(nombre).concat("_");
        }

        imprimirCadena(nombreCompleto);
    }
    static void imprimirCadena ( String nombre){

        System.out.println(nombre);

    }
}
