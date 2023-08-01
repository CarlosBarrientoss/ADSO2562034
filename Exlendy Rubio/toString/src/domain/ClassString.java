package domain;


public class ClassString{
    private String name;
    private Integer phone;
    private double salary;

    public ClassString(String name, Integer phone, double salary) {
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ClassString{" + "name=" + this.name + ", phone=" + this.phone + ", salary=" + this.salary + '}';
    }
    
}
//classLoader

    
