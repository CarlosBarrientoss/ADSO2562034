package domain;


public class PersonModel {
    private String name;
    private double salary;
    private boolean state;


    public PersonModel(String name, double salary, boolean state) {
        this.name = name;
        this.salary = salary;
        this.state = state;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}