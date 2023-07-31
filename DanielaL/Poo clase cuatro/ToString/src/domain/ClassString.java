package domain;

public class ClassString {
    private String name;
    private int phone;
    private Double salary;

    public ClassString(String name, int phone, Double salary){
        this.name =name;
        this.phone = phone;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return " Person 1[ name: "
                + this.name
                +" , Phone: "
                + this.phone
                + " , Salary "
                +this.salary+']';
    }
}
