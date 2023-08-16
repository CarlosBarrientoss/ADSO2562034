import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] nombres = {"Hugo", "Dani", "Camila", "Rafael"};

        List<String> listaNombre = Arrays.asList(nombres);
        List<String> listaFruta = new ArrayList<>();

        List<String> listaAuto = new ArrayList<>();
            System.out.println("Lista:" + listaAuto);
            listaAuto.add("MVW");
            listaAuto.add("Ferrari");
            listaAuto.add("Toyota");
            listaAuto.remove("Ferrari");
            System.out.println("Lista:" + listaAuto);
            listaAuto.remove(1);
            System.out.println("Lista:" + listaAuto);
        List<String> elemento = new ArrayList<>(listaAuto);

            listaFruta.add ("Manzana");
            listaFruta.add ("Mandarina");
            listaFruta.add ("Uva");

        System.out.println("Tamaño de la lista: " + listaFruta.size());
        System.out.println("Contenido de la lista: " + listaFruta);

            for (String fruta : listaFruta){
                System.out.println("Fruta: " + fruta);

            }


        }
    }


































































































































