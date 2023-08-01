import domain.PersonModel;
import domain.EmployeeModel;
public class InheritenceApp {
    public static void main(String[] args) {
        
        PersonModel person1=new PersonModel();
          System.out.println("person1 = " + person1);  
          
          EmployeeModel employee1=new EmployeeModel("zulay", 100);
          System.out.println("employee1 = " + employee1);
        }
            
        
    }
 

