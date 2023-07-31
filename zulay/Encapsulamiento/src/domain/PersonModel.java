
package domain;

public class PersonModel {
    private String name;
    private String salario;
    private String estado;
    public String getSalario;

    public PersonModel(String name, String salario, String estado) {
        this.name = name;
        this.salario = salario;
        this.estado = estado;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public String toString(){
        return "PersonModel{"+"nombre"+name+"salario"+salario+"estado="+estado+'}';
    }
    
}
