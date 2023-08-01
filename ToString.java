import domain.ClassString;

public class ToString {
    
    public static void main(String[] args) {
        ClassString person1 = new ClassString("Elon musk",315662663,10000.0);
       System.out.println("Person1 =" + person1.getName());
       System.out.println("Person1 =" + person1.getPhone());
       System.out.println("Person1 =" + person1.getSalary());
    }
    
}
