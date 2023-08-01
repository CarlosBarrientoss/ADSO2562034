import Domain.PersonModel;

public class StaticContextApp {
    public static void main(String[] args) {
        PersonModel person1Void = new PersonModel();
        System.out.println("PersonVoid "+ person1Void);
        PersonModel person1 = new PersonModel("Jeff Bezos");
        System.out.println("Person1 "+ person1);
    }
}
