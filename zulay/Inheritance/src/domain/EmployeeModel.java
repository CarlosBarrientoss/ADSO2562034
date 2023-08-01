
package domain;


public class EmployeeModel extends PersonModel{

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void setEmployeeCount(int aEmployeeCount) {
        employeeCount = aEmployeeCount;
    }
    private int idEmployee;
    private double salario;
    private static int employeeCount;
    public EmployeeModel(){
      
        
        
    }

    public EmployeeModel(String name, char gender, int age, String adrres, double salario) {
        super(name,gender,age,adrres);
        this.salario=salario;
        this.idEmployee = ++employeeCount;

        
        
    }

    public EmployeeModel(String zulay, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdEmployee() {
        return idEmployee;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" + "idEmployee=" + idEmployee + ", salario=" + salario + '}';
    }
    
    

   
    }
    

