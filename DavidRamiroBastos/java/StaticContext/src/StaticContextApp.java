
import domain.PersonModel;


public class StaticContextApp {
    public static void main(String[] args) {
        PersonModel personvoid = new PersonModel();
        
        PersonModel person1 = new PersonModel( 0,"jordy");
        System.out.println("person 1 = "+ person1.toString());
        
        PersonModel person2 = new PersonModel (0, "felipe ");
        System.out.println("person 2 = "+ person2.toString());
        
         PersonModel person3 = new PersonModel (0, "santiago ");
        System.out.println("person 3 = "+ person3.toString());
        
        
    }
}
