package es.vicarmi;

public class Funciones {

    public static void main(String[] args) {

        double precioSin = 1234.33;
        double precioCon = calcularIva(precioSin);

        System.out.println("Precio s/i : " + precioSin);
        System.out.println("Precio c/i : " + precioCon);

    }

    static double calcularIva (double precio){

        return precio * 1.21 ;
    }
}
