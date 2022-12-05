package Proyecto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> agenda = new HashMap<>();

        agenda.put(658854811, "Vicente Carlon");
        agenda.put(617364799, "Raquel Diaz");
        agenda.put(656681690, "Patricia Carlon");

        System.out.println(agenda);

        ArrayList<String> contacto = new ArrayList<>();

        for (Map.Entry<Integer, String> dato : agenda.entrySet()) {
            contacto.add(dato.getValue());
        }
        System.out.println(contacto);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce numero de telefono: ");
        int telefono = entrada.nextInt();
        System.out.println("Introduce nombre :");
        String nombre = entrada.next();

        agenda.put(telefono, nombre);
        System.out.println(agenda);

    }
}