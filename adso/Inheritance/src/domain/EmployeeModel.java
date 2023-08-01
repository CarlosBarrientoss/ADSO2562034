package domain;

public class EmployeeModel extends PersonModel {
    private int idEmployee;
    private double salary;
    private static int employeeCount;

    public EmployeeModel() {

    }

    public EmployeeModel(String name, double salary, char gender, int age, String address) {
        super (name, gender, age, address);
        this.salary = salary;

        this.idEmployee = ++EmployeeModel.employeeCount;
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
        return employeeCount;
    }

    public static void setEmployeeCount(int employeeCount) {
        EmployeeModel.employeeCount = employeeCount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeeModel{");
        sb.append("idEmployee=").append(this.idEmployee);
        sb.append(", salary=").append(this.salary);
        sb.append(", name=").append(this.name);
        sb.append(", Padre=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}