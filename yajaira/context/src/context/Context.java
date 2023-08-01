package context;

import domain.PersonModel;

public class Context {

    public static void main(String[] args) {
        PersonModel personVoid = new PersonModel("lore");
        System.out.println("personVoid = " + personVoid);
        
        PersonModel model = new PersonModel("lore");
        System.out.println("model = " + model);
                
        
                    
    }
    
}
