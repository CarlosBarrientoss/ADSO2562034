import domain.EmployeeModel;
import domain.PersonModel;

public class WorldFinalApp {
    public static void main(String[] args) {
        PersonModel instance = new PersonModel();
        EmployeeModel instance1 = new EmployeeModel();

        instance.saludar();
        instance1.saludar();
    }
}