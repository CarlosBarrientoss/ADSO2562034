
package domain;

public class EmployeeModel extends PersonModel{

  
    private int idEmployee;
    private double Salary;
    private static int Employeecount;
    
    public EmployeeModel(){
        
    }

    public EmployeeModel(String name,double salary) {
        
      super(name);
      
        this.Salary = Salary;
        
        this.idEmployee = ++EmployeeModel.Employeecount;
        
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public static int getEmployeecount() {
        return Employeecount;
    }

    public static void setEmployeecount(int Employeecount) {
        EmployeeModel.Employeecount = Employeecount;
    }
    

    
    
    
}
