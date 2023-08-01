
package staticcontext;

import domain.PersonModel;
public class StaticContext {

    
    public static void main(String[] args) {
        PersonModel personVoid=new PersonModel("zulay");
        System.out.println("personVoid = " + personVoid);
        
        PersonModel person1=new PersonModel("yajaira");
        System.out.println("person1 = " + person1);
    }
    
}
