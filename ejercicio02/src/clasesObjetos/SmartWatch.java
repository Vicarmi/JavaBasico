package clasesObjetos;

public class SmartWatch extends SmartDevice {

    // atributos

    int tallaPulsera;
    boolean actividad;

    // contructor
    public SmartWatch() {

    }
    public SmartWatch(String marca, String modelo, String sistOperativo, int year, double pantalla, boolean encendido, int tallaPulsera, boolean actividad) {
        super(marca, modelo, sistOperativo, year, pantalla, encendido);
        this.tallaPulsera = tallaPulsera;
        this.actividad = actividad;
    }


    // metodos
    public void iniciarActividad(){
        this.actividad = true;
    }

    public void pararActividad(){
        this.actividad = false;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "actividad=" + actividad +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistOperativo='" + sistOperativo + '\'' +
                ", year=" + year +
                ", pantalla=" + pantalla +
                ", encendido=" + encendido +
                '}';
    }
}
