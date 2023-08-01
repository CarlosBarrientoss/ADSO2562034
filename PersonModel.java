
package domain;

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

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
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

    public static void setPersonCount(int aPersonCount) {
        personCount = aPersonCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonModel{");
        sb.append("idPerson=").append(idPerson);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }
    
    
}
