package excepciones;

public class Main {
    public static void main(String[] args) {

        try {
            dividePorCero();
        } catch ( Exception e) {
            throw new ArithmeticException("Esto no puede hacerse");
            //System.out.println( "Esto no puede hacerse");
        } finally {
            System.out.println( "Demo de código");
        }
    }

    public static int dividePorCero () throws ArithmeticException {

        return 5 / 0;
    }

}
