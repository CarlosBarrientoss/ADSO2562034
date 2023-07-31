package dominio;

public class PersonModel {
    private String nombre;
    private String salario;
    private String estado;

    public PersonModel(String nombre, String salario, String estado) {
        this.nombre = nombre;
        this.salario = salario;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "PersonModel{" + "nombre=" + nombre + ", salario=" + salario + ", estado=" + estado + '}';
    }
    
    
    
}
