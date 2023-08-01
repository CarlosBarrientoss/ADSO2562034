
package domain;


public class ClassString {
    private String nombre;
    private String celular;
    private double salario;

    public ClassString(String nombre, String celular, double salario) {
        this.nombre = nombre;
        this.celular = celular;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "ClassString{" + "nombre=" + nombre + ", celular=" + celular + ", salario=" + salario + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
