import domain.EmployeeModel;
import domain.PersonModel;

    public class InherentanceApp {
        public static void main (String [] args) {
            PersonModel persona1 = new PersonModel();
            System.out.println("persona1" + persona1);

            EmployeeModel el = new EmployeeModel ("juan",3000);
            System.out.println("empleado 1" + el);
            
        }
    }
