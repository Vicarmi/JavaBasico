package array;

public class arrayUniBi {
    public static void main(String[] args) {

        //***************************************************
        //lista unidimensional
        // ***************************************************

        String lista[] = {"Vicente", "Carlon", "Miguel", "Villadoniga", "Diaz"};
        //String lista2[] = new String [5];
        String listaEnLinea = "";


        //***************************************************
        //lista bidimensional
        // ***************************************************

        int listaEnteros[][] = {{1,2},{3,4}, {5,6},{7,8},{9,0}};
        //int listaEnteros2[][] = new int [5][2];


        System.out.println("**************************************");
        System.out.println("*****   ARRAY    UNIDIMENSIONAL  *****");
        System.out.println("**************************************");

        //***************************************************
        //recorre lista con foreach
        //***************************************************
        for (String nombre : lista) {
            System.out.println(nombre + " ");
        }

        System.out.println("--------------------------");

        //***************************************************
        //recorre lista con for
        //***************************************************

        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i] + " ");
        }

        System.out.println("--------------------------");

        //***************************************************
        //*** recorre lista con for e imprime en la misma linea
        //***************************************************

        for (String nombre : lista) {
            listaEnLinea = listaEnLinea + nombre + " ";

        }
        System.out.println(listaEnLinea);


        System.out.println("**************************************");
        System.out.println("*****   ARRAY    BIDIMENSIONAL   *****");
        System.out.println("**************************************");
        //***************************************************
        //*** recorre listaEnteros con foreach
        //***************************************************

        for (int[] parX: listaEnteros){

            System.out.println(" Completo : " + parX[0] + " " + parX [1]);

          }
        
        //***************************************************
        //*** recorre listaEnterros con for
        //***************************************************

        for ( int  i = 0 ; i < listaEnteros.length ; i++){

            for ( int j = 0 ; j < listaEnteros[i].length ; j++){

                System.out.println("Fila :" + i + " Column:" + j + " Valor :" + listaEnteros[i][j]);
        }


        }

    }
}
