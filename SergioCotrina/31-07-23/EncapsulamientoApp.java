
package encapsular;

import domain.auto;

public class EncapsulamientoApp {
    public static void main(String[] args) {
        auto instance = new auto ("Lamborghini", "47RHLM" , "Black");
        
        instance.getMarca();
        instance.getPlaca();
        instance.getColor();
        
        
        System.out.println("Marca = " + instance.getMarca());
        System.out.println("Placa = " + instance.getPlaca());
        System.out.println("Color = " + instance.getColor());
    }
}
