import domain.PersonModel;
public class StaticContextApp {
    public static void main(String[] args) {
        PersonModel personVoid = new PersonModel();
        System.out.println("personVoid = " + personVoid);

        PersonModel person1 = new PersonModel("Petronila Perez");
        System.out.println("person1 = " + person1);

        PersonModel person2 = new PersonModel("Pancho Quemao");
        System.out.println("person2 = " + person2);

        PersonModel person3 = new PersonModel("Pepito Pinchao");
        System.out.println("person3 = " + person3);
    }
}