
package domain;
import domain.WordFinal;
public class EmployeeModel extends WordFinal{
    
    @Override
    public void saludo(String s){
     System.out.println("Clase hija: " + s);
    }
    
}
