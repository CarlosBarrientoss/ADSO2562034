import domain.PersonModel;
import domain.VehicleModel;

public class EncapsulationApp {

    public static void main(String[] args) {

        //PersonModel instance = new PersonModel("Hugo", 5000, true);
        //instance.setName("Juan");

        VehicleModel instance2 = new VehicleModel("Diesel", 50, "Negro", 1200000, "Ferrari", true);
        System.out.println("motor"+ instance2.getMotor());
        System.out.println("velocidad"+ instance2.getVelocidad());
        System.out.println("color"+ instance2.getColor());
        System.out.println("precio"+ instance2.getPrecio());
        System.out.println("modelo"+ instance2.getModelo());
        System.out.println("Esta Activo?"+ instance2.getState());

        //System.out.println("instance = " + instance.getName());
    }
}
