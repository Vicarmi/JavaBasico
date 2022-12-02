package es.vicarmi;

public class Principal {

    public static void main(String[] args) {

        byte numeroByte= 5;
        short numeroShort = 4;
        int numeroInt = 14;
        long numeroLong = 1200;

        float numeroFloat= 1.1f;
        double numeroDouble = 5.33d;

        boolean verdad = true;
        boolean noVerdad = false;

        System.out.println("Números enteros : " + " byte " + numeroByte + " short "+ numeroShort + " int "  + numeroInt + " long " + numeroLong);
        System.out.println( "Números decimales : " + " float " + numeroFloat + " double " + numeroDouble);

        System.out.println("Si es verdad entonces  " + verdad + " sino es " + noVerdad);

    }
}
