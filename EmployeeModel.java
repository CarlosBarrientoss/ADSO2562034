package domain;

public class EmployeeModel extends PersonModel{

    public static int getEmployeeCount() {
        return EmployeeCount;
    }

    public static void setEmployeeCount(int aEmployeeCount) {
        EmployeeCount = aEmployeeCount;
    }
    private int idEmployee;
    private double salary;
    private static int EmployeeCount;
    
    public EmployeeModel (){
               
    }

    public EmployeeModel(String name,double salary) {
        super(name);
        this.salary = salary;
        
        this.idEmployee =++EmployeeModel.EmployeeCount;
        }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "EmployeeModel{" + "name" + name + "idEmployee=" + idEmployee + "salary=" + salary + '}';
    }
    
}
