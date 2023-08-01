import domain.PersonModel1;

public class StaticContexApp {
    public static void main(String[] args) {
        PersonModel1 personaVoid = new PersonModel1(); 
        PersonModel1 personTwo = new PersonModel1("rubio");
        PersonModel1 personOne = new PersonModel1("camila");
        System.out.print("personaOne: " + personOne);
        System.out.print("persontwo" + personTwo);
        
//      ClassString personOne = new ClassString("elon musk",1234567,100000.0);
//
//        System.out.print( "name person: " + personOne.getName());
//        System.out.print("phone person: " + personOne.getPhone());
//        System.out.print("salary person: " + personOne.getSalary());
//        System.out.print("todos los datos: " + personOne.toString());  
    } 
}
    
//statico, dinamico