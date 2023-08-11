package domain;

public class ClassString {
    private String name;
    private long phone;
    private double salary;
    
    public ClassString(String name, int phone, double salary){
        this.name = name;
        this.phone = phone;
        this.salary = salary;
        
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
