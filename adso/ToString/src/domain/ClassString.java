package domain;

public class ClassString {
    private String name;
    private Double salary;
    private Integer phone;

    public ClassString (String name, Double salary, Integer phone){
        this.name = name;
        this.phone = phone;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String toString(){
        return "Person [ name: " + this.name + ", salary: " + this.salary + ", phone: " + this.phone + ']';
    }
}
