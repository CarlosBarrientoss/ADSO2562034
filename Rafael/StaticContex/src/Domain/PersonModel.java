package Domain;

public class PersonModel {
    private int idPerson;
    private String name;
    private static int personCount;

    public PersonModel(){

    }
    public PersonModel(String name){
        this.name = name;
        PersonModel.personCount++;
        this.idPerson = PersonModel.personCount;
    }

    public int getIdPerson() {
        return this.idPerson;
    }

    public String getName() {
        return this.name;
    }

    public static int getPersonCount() {
        return personCount;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static void setPersonCount(int personCount) {
        PersonModel.personCount = personCount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonModel{");
        sb.append("idPerson=").append(idPerson);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
