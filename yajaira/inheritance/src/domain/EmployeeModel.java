package domain;

public class EmployeeModel extends PersonModel {

    public static int getEmployeeCount() {
        return EmployeeCount;
    }

    public static void setEmployeeCount(int aEmployeeCount) {
        EmployeeCount = aEmployeeCount;
    }

    private int idEmployee;
    private double salary;
    private static int EmployeeCount;

    public EmployeeModel() {
        
       

    }

    public EmployeeModel(String name, char gender, int age, String address, double salary) {
        super(name, gender, age, address);
       
        this.salary = salary;
        this.idEmployee = ++EmployeeModel.EmployeeCount;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" + "idEmployee=" + idEmployee + ", salary=" + salary + '}';
    }

}
