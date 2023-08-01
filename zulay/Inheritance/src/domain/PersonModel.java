
package domain;


public class PersonModel {
    protected String name;
    protected char gender;
    protected int age;
    protected String adrres;
    
    public PersonModel(){
        
    }

    public PersonModel(String name) {
        this.name = name;
    }
    

    public PersonModel(String name, char gender, int age, String adrres) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.adrres = adrres;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdrres() {
        return this.adrres;
    }

    public void setAdrres(String adrres) {
        this.adrres = adrres;
    }

    @Override
    public String toString() {
        return "PersonModel{" + "name=" + name + ", gender=" + gender + ", age=" + age + ", adrres=" + adrres + '}';
    }
    
    
    
    
}
