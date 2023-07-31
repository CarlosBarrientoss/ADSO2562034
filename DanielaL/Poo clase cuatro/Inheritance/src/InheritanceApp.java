import domain.PersonModel;
import domain.EmployeeModel;

public class InheritanceApp {
    public static void main(String[] args) {
        /*PersonModel peron1 = new PersonModel();
        System.out.println("peron1 = " + peron1);*/

        EmployeeModel employee1 = new EmployeeModel(10000.0,"Master",'F', 23,"La luna");
        System.out.println("employee1 = " + employee1);
    }
}