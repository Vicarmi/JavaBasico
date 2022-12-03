package clasesObjetos;

public abstract class SmartDevice {

    //
    // atributos
    //

    String marca;
    String modelo;
    String sistOperativo;
    int year;
    double pantalla;
    boolean encendido;

    //
    // contructor
    //
    public SmartDevice() {

    }
    public  SmartDevice(String marca, String modelo, String sistOperativo, int year, double pantalla, boolean encendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistOperativo = sistOperativo;
        this.year = year;
        this.pantalla = pantalla;
        this.encendido = encendido;
    }



    //
    // Métodos
    //

    public void encender (){
        this.encendido = true;
    }
    public void apagar () {
        this.encendido = false;
    }


}