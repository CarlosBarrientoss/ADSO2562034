
package domain;


public class PersonModel {


    private int idPerson;
    private String name;
    private static int PersonCoun;
    
    public PersonModel (){
    
    
    
    }
    
    public PersonModel(int idPerson, String name){
        
        this.idPerson=idPerson;
        this.name = name;
       
        PersonModel.PersonCoun++;
        this.idPerson = PersonModel.PersonCoun;
    
    
    
    
    }

    public int getIdPerson() {
        return this. idPerson;
    }


    public String getName() {
        return this.name ;
    }

    public void setName(String name) {
        this.name = name;
    }
        public static int getPersonCoun() {
        return PersonCoun;
    }

    public static void setPersonCoun(int aPersonCoun) {
        PersonCoun = aPersonCoun;
    }


    public String toString() {
        return "PersonModel{" + "idPerson=" + idPerson + ", name=" + name + '}';
    }
    
}
