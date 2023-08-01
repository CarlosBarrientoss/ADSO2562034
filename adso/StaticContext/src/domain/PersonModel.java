package domain;

public class PersonModel {

    private Integer idPerson;
    private String name;
    private static int personCount;

    public PersonModel(){
        super();
        this.idPerson = ++PersonModel.personCount;
    }

    public PersonModel(String name){
        this();
        this.name = name;
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

    public static int getPersonCount() {
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