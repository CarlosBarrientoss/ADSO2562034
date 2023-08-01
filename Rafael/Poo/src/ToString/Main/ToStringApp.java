package ToString.Main;

import ToString.Domain.ClassString;

public class ToStringApp {
    public static void main(String[] args) {
        ClassString person1 = new ClassString("Elon Musk", 31287362, 10000.0);
        //System.out.println("Name person1: "+ person1.getName());
        //System.out.println("phone person1: "+ person1.getPhone());
        //System.out.println("Salary person1: "+ person1.getSalary());
        System.out.println("Person1: "+ person1);
    }
}
