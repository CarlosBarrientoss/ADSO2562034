package domain;

public class PersonModel {


    private int idperson;
    private String name;


    private static int personCount;

    public PersonModel() {
    }

    public PersonModel( String name){
        this.name = name;
        PersonModel.personCount++; //hace falta sumarselo
        this.idperson = PersonModel.personCount;

    }

    public int getIdperson() {
        return this.idperson;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getPersonCount() {
        return personCount;
    }

    public static void setPersonCount(int personCount) {
        PersonModel.personCount = personCount;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonModel{");
        sb.append("idperson=").append(idperson);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
