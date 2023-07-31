
import domain.PersonModel;


public class EncapsulamientoApp {

    public static void main(String[] args) {
        
        PersonModel model = new PersonModel("zulay", "12333", "false");
        System.out.println("model = " + model);
        model.setName("zulay");

        System.out.println("model = " + model.getSalario);
    }
}
