import domain.PersonModel;
import domain.EmployeeModel;

public class InheritanceApp {
    public static void main(String[] args) {
        //PersonModel person1 = new PersonModel();
        //System.out.println("Persona 1: " + person1);

        EmployeeModel employee1 = new EmployeeModel("Hugo",1000.,'F', 20, "Narnia");
        System.out.println("employee1 = " + employee1);
    }
}