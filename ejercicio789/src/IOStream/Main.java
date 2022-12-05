package IOStream;

import java.io.*;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        String fileIn = "src/fichero.txt";
        String fileOut = "src/ficheroDestino.txt";

        try {
            InputStream ficheroIn = new FileInputStream(fileIn);
            PrintStream ficheroOut = new PrintStream(fileOut);

            ficheroOut = copiarFichero(ficheroIn, ficheroOut);

            byte datos[] = ficheroIn.readAllBytes();
            for ( byte datoE : datos){
                System.out.println(datoE);
            }


            ficheroIn.close();
            ficheroOut.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra fichero");
        } catch (IOException e) {
            System.out.println("ERROR FICHERO");
        }

    }

    public static  PrintStream copiarFichero (InputStream ficheroIn, PrintStream ficheroOut){

        try {
            byte datos[] = ficheroIn.readAllBytes();
            for(byte dato : datos) {
                ficheroOut.println((char)dato);
            }

        } catch (IOException e){
            System.out.println("NO PUEDE LEER FICHERO" + e.getMessage());
        }


        return ficheroOut;

        }

}
