
import dominio.PersonModel;


public class EncapsulamientoApp {
    public static void main(String[] args) {
        
        PersonModel model = new PersonModel("li", "100", "true");
        System.out.println("model = " + model);
        
        model.setNombre("lorena");
         System.out.println("model = " + model.getSalario());
    }
}
