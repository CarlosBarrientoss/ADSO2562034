package domain;

public class EmployeeModel extends PersonModel{
    private int idEmployee;
    private double salary;
    private static int employeeCount;

    public EmployeeModel(){

    }

    public EmployeeModel(double salary, String name, char gender, int age, String addres) {
        super(name,gender,age,addres);
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
        sb.append(", ").append(super.toString());
        sb.append(", name='").append(this.name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}