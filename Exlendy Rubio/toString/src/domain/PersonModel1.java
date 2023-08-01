package domain;

public class PersonModel1 {
    private int idperson;
    private String name;
    private static int personcount;

    public PersonModel1() {
    }
    
    public PersonModel1(String name) {
        this.name = name;
        PersonModel1.personcount++;
        this.idperson =  PersonModel1.personcount++;
    }

    public Integer getIdperson() {
        return idperson;
    }

    public String getName() {
        return name;
    }

    public static Integer getPersoncount() {
        return personcount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setPersoncount(Integer personcount) {
        PersonModel1.personcount = personcount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonModel{");
        sb.append("idperson=").append(idperson);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }   
}
