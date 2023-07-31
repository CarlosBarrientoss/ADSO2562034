
import domain.Personmodel;
import domain.Vehiculomodel;


public class encapsulationApp {
    public static void main (String [] args){
        Personmodel instance = new Personmodel ("julian", 5000000, true);
        
        instance.setName("Baryan");
        instance.setName("Rafael");
        
        System.out.println("instnace = " + instance.getName ());
    
    
    Vehiculomodel instance2 = new Vehiculomodel ("Nissn", "Rojo" ,5000000,true);
    instance2.setMotor("Ferrari");
        System.out.println("Motor "+ instance2.getMotor());
    }
    
}
