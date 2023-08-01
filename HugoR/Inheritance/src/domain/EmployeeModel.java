package domain;
public class EmployeeModel extends PersonModel {
    private int idEmployee;
    private double salary;
    private static int EmployeeCount;

    public EmployeeModel(){

    }

    public EmployeeModel(String name, double salary, char gender, int age, String address) {
        super(name, gender, age, address); // nos va referenciar a un constructor y tiene que ser de primero
        this.salary = salary;

        //EmployeeModel.EmployeeCount++;
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

    public static int getEmployeeCount() {
        return EmployeeCount;
    }

    public static void setEmployeeCount(int employeeCount) {
        EmployeeCount = employeeCount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeeModel{");
        sb.append("idEmployee=").append(this.idEmployee);
        sb.append(", salary=").append(this.salary);
        sb.append(", name=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
