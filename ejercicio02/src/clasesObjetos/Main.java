package clasesObjetos;

public class Main {

    public static void main(String[] args) {

        SmartPhone smartphone = new SmartPhone();
        SmartWatch smartWatch = new SmartWatch();


        SmartPhone telefono = new SmartPhone("Samsung", "Galaxy","Android",2015,6.33, false,true);
        SmartWatch reloj = new SmartWatch("Xiaomi","My Watch","wear os",2019,4.2,false,3, false);

        System.out.println(telefono.toString());
        System.out.println(reloj.toString());

        telefono.encender() ;
        reloj.iniciarActividad();

        System.out.println(telefono.encendido);
        System.out.println(reloj.actividad);
        System.out.println("----------------------");

        imprimirDatos(telefono);
        imprimirDatos(reloj);




    }
    static void imprimirDatos(SmartDevice smartdevice){
        System.out.println("Marca : " + smartdevice.marca + " Modelo : " + smartdevice.modelo );

        if (smartdevice instanceof SmartPhone) {
            System.out.println("Funda : " + ((SmartPhone) smartdevice).funda);

        } else if (smartdevice instanceof SmartWatch) {
            System.out.println("Pulsera talla : " + ((SmartWatch) smartdevice).tallaPulsera);
        }
    }
}
