
package encapsulamiento;

import domain.Auto;


public class EncapsulationApp {
    
    public static void main(String[] args) {
        Auto instance = new Auto ("ferrari","111BBC","Gold");
        //instance
        
        instance.getMarca ();
        instance.getPlaca();
        instance.getColor();
        
        System.out.println("Marca =" + instance.getMarca());
        System.out.println("Placa =" + instance.getPlaca());
        System.out.println("Color =" + instance.getColor());

    }
    
}
