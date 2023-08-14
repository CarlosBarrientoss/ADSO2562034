
import domain.Principal;

public class Notas {

    public static void main(String[] args) {
        Double[] array = new Double[3];
        array[0] = 3.0;
        array[1] = 4.5;
        array[2] = 5.0;
        System.out.println(Principal.nota(array));
        System.out.println(Principal.Examen(4.5));
    }
}
