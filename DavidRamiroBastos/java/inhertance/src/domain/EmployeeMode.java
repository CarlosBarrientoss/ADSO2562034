
package domain;

public class EmployeeMode extends PersonModel {

    public static int getEmployeedCount() {
        return employeedCount;
    }

    public static void setEmployeedCount(int aEmployeedCount) {
        employeedCount = aEmployeedCount;
    }
    private int idEmployeed;
    private double salary;
    private static int employeedCount;

   
    public EmployeeMode(){
        
    }

    public EmployeeMode(String name, double salary) {
        super(name);
        this.salary = salary;
        //EmployeeMode.employeedCount++;
        this.idEmployeed = ++EmployeeMode.employeedCount;
        
    }

    public int getIdEmployeed() {
        return this.idEmployeed;
    }

    public void setIdEmployeed(int idEmployeed) {
        this.idEmployeed = idEmployeed;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeMode{"+ "name= " + nombre + "idEmployeed=" + idEmployeed + ", salary=" + salary + '}';
    }
       
}
