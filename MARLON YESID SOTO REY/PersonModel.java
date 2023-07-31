
package encapsulationapp;

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
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
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
