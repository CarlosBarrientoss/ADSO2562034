package domain;

public class EmployedModel extends PersonModel{
    private int idEmployed;
    private double salary;
    private  static int  employedCount;

    public EmployedModel() {
    }

    public EmployedModel(double salary,String name,char gender,int age, String addres) {
        super(name,gender,age,addres);
        this.salary= salary;
        EmployedModel.employedCount++;
        this.idEmployed =  EmployedModel.employedCount++;
    }

    public int getIdEmployed() {
        return idEmployed;
    }

    public double getSalary() {
        return salary;
    }

    public static int getEmployedCount() {
        return employedCount;
    }

    public void setIdEmployed(int idEmployed) {
        this.idEmployed = idEmployed;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void setEmployedCount(int employedCount) {
        EmployedModel.employedCount = employedCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EmployedModel{");
        sb.append("idEmployed=").append(idEmployed);
        sb.append(", salary=").append(salary);
        sb.append(", name=").append(this.name);
        sb.append(", padre=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
