import domain.PersonModel;
import domain.EmployeeModel;

public class InheritanceApp {
    public static void main(String[] args) {
        PersonModel person1 = new PersonModel();
        System.out.println("person1: "+ person1);

        EmployeeModel employee1 = new EmployeeModel("brayan", 1000.0, 'M', 24, "Luna");
        System.out.println("employee1 = " + employee1);
    }
}
