package domain;

public class PersonModel {
    private int idPerson;
    private String name;
    private static int personCount;

    public PersonModel() {

    }

    public PersonModel(String name){
        this.name = name;
        PersonModel.personCount++;
        this.idPerson = PersonModel.personCount;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Integer getPersonCount() {
        return personCount;
    }

    public static void setPersonCount(Integer personCount) {
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