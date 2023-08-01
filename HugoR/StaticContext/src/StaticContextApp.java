import domain.PersonModel;
public class StaticContextApp {
    public static void main(String[] args) {

        PersonModel personvoid = new PersonModel();
        System.out.printf("persona "+ personvoid);
        System.out.println("");
        System.out.println("");
        PersonModel person1 = new PersonModel("Hugoo");
        System.out.printf("persona "+ person1);
        System.out.println("");
        PersonModel person2 = new PersonModel("ronald");
        System.out.printf("persona "+ person2);
        System.out.println("");
        PersonModel person3 = new PersonModel("camila");
        System.out.printf("persona "+ person3);


    }
}