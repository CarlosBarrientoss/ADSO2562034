
package domain;

public class PersonModel {
    private int idPerson;
    private String name;
    private static int personCount;
    
    
    public PersonModel(){
        
    }

    public PersonModel( String name) {
        
        this.name = name;
        PersonModel.personCount++;
        this.idPerson=PersonModel.personCount;
    }

    public int getIdPerson() {
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

    public static void setPersonCount(int personCount) {
        PersonModel.personCount = personCount;
    }

    @Override
    public String toString() {
        return "PersonModel{" + "idPerson=" + idPerson + ", name=" + name + '}';
    }
    
    
   
        
    }

