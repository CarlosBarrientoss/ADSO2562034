import domain.PersonModel;
import domain.EmployeeModel;


public class InheritanceApp {
    public static void main(String[] args) {

        PersonModel person1 = new PersonModel("Hugo", 'F', 20, "lUNA");
        System.out.println("Persona = " + person1);

        EmployeeModel employee1 = new EmployeeModel("master", 25000, 'F', 20, "Luna");
        System.out.println("employee = " + employee1);

        }




    }
