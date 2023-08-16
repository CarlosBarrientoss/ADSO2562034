import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        String[] nombres = {"Hugo", "Elon", "Mark"};
        List<String> listaNombres = Arrays.asList(nombres);
        //System.out.println("ListaNombres ="+ listaNombres);
//////////////////////////////////////////////////
        List<String> autos = new ArrayList<>();
        List<String> elementos = new ArrayList<>(autos);
        autos.add("BMW");
        autos.add("Toyota");
        autos.add("Ferrary ");
        System.out.println("auto = "+ autos);
        System.out.println("Tamaño "+ autos.size());
        autos.remove(1);
        //autos.clear();
        //autos.remove("Toyota");



        /////////////////////////////////////
        List<String> listaFruta = new ArrayList<>();

        listaFruta.add("Manzana");
        listaFruta.add("fresa");
        listaFruta.add("banana");

        for(String fruta: listaFruta){
            System.out.println("Contenido de la lista: "+ fruta);

        }
        System.out.println("Tamaño: " + listaFruta.size());
    }
}