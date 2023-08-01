
package domain;


public class ClassString {
    private String name;
    private int phone;
    private double salary;

    public ClassString(String name, int phone, double salary){
          this.name = name;
          this.phone = phone;
          this.salary = salary;
}

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String toString(){
        return "Person [ name: " + this.name 
                + ", Phone: " + this.phone 
                + ", Salary:" + this.salary + ']';
    }

}
