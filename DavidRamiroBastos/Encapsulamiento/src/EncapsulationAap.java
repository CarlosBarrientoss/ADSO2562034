
import domain.CarModel;

class EncapsulationAap {
    public static void main(String[] args) {
        CarModel car1 = new CarModel("bmw","m40i",50000.00,"rojo","true");
        
//        car1.setModel("bmw");
//        car1.setMotor("m40i");
//        car1.setPrice(50000);
//        car1.setColor("rojo");
//        car1.setState("true");
        
        System.out.println("motor del carro " + car1.getMotor());
        System.out.println("modelo del carro " + car1.getModel());
        System.out.println("color del carro " + car1.getColor());
        System.out.println("estado del carro " + car1.isState());
        System.out.println("precio del carro " + car1.getPrice());
        
        
    }
}
