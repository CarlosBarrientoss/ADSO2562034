import domain.PersonModel;
        
public class StaticContextApp {
    public static void main(String[] args) {
        PersonModel personVoid = new PersonModel();
        System.out.println("persona1" + personVoid);
        
        PersonModel person1 = new PersonModel ("Jeff Bezos");
        System.out.println("person1 = " + person1);
        
        PersonModel person2 = new PersonModel ("Elon Musk");
        System.out.println("person2 = " + person2);
        
        PersonModel person3 = new PersonModel ("Mark Zuckerberg");
        System.out.println("person3 = " + person3);
    }
    
    
    
}
