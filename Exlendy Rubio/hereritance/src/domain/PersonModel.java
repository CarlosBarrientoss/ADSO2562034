package domain;

public class PersonModel {
    
    protected String name;
    protected char gender;
    protected int age;
    protected String addres;

    public PersonModel() {
    }

    public PersonModel(String name) {
        this.name = name;
    }
    

    public PersonModel(String name, char gender, int age, String addres) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.addres = addres;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getAddres() {
        return addres;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    @Override
    public String toString() {
        return "PersonModel{" + "name=" + name + ", gender=" + gender + ", age=" + age + ", addres=" + addres + '}';
    }
    
}
