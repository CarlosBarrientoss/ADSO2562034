import domain.PersonModel;
public class StaticContextApp {
    public static void main(String[] args) {
        PersonModel personVoid = new PersonModel();
        System.out.println("esta vacio" + personVoid);

        PersonModel person1 = new PersonModel("Huguito");
        System.out.println(person1);

        PersonModel person2 = new PersonModel("Camila");
        System.out.println(person2);

        PersonModel person3 = new PersonModel("Daniela");
        System.out.println(person3);
    }
}