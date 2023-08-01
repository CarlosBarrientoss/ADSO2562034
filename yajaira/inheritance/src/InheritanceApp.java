import domain.PersonModel;
import domain.EmployeeModel;
public class InheritanceApp {
    public static void main(String[] args) {
        PersonModel mode = new PersonModel();
        System.out.println("mode = " + mode);
        
        EmployeeModel em = new EmployeeModel();
        System.out.println("em = " + em);
    }
    
    
}
