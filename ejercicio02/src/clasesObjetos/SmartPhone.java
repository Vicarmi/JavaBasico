package clasesObjetos;

public class SmartPhone extends SmartDevice{

    // atributos

    boolean funda;

    // contructor
    public  SmartPhone(){

    }

    public SmartPhone(String marca, String modelo, String sistOperativo, int year, double pantalla, boolean encendido, boolean funda) {
        super(marca, modelo, sistOperativo, year, pantalla, encendido);
        this.funda = funda;
    }


    // metodos

    @Override
    public String toString() {
        return "SmartPhone{" +
                "funda=" + funda +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistOperativo='" + sistOperativo + '\'' +
                ", year=" + year +
                ", pantalla=" + pantalla +
                ", encendido=" + encendido +
                '}';
    }
}
