import domain.PersonModel;
import domain.EmployeeMode;
public class InhertanceApp {
    public static void main(String[] args) {
        PersonModel persona1 = new PersonModel();
        System.out.println("persona1: " + persona1);
        
        EmployeeMode empleado1 = new EmployeeMode("Master", 10000000);
        System.out.println("empleado1: " + empleado1);
    }  
}
