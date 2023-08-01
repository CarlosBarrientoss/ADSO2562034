
package domain;

public class PersonModel {
      protected String name;
    protected char gender;
    protected int age;
    protected String adddress;
    
    public PersonModel(){
        
    }
    
    public PersonModel(String name){
        this.name = name;
    }

    public PersonModel(String name, char gender, int age, String adddress) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.adddress = adddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdddress() {
        return adddress;
    }

    public void setAdddress(String adddress) {
        this.adddress = adddress;
    }

    @Override
    public String toString() {
        return "PersonModel{" + "name=" + name + ", gender=" + gender + ", age=" + age + ", adddress=" + adddress + '}';
    }
    
    
  
    
}
