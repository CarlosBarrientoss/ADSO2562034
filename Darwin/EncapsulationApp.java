
import Domain.Personas;

public class EncapsulationApp {
    public static void main(String[] arg){
        Personas instance = new Personas ("carlos", 5000000, true);
        
        instance.setName("carlos");
        instance.setName("julian");
        
        System.out.println("instance= "+ instance.getName());
        
        
    }
    
}
