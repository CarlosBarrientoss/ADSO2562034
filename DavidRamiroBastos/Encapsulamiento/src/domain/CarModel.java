package domain;

public class CarModel {
    private String model;
    private String motor;
    private double price;
    private String color;
    private String state;
    
    public CarModel(String model, String motor, double price, String color, String state){
        this.color = color;
        this.model = model;
        this.price = price;
        this.state = state;
        this.motor = motor;
        
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMotor() {
        return this.motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String isState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    
    
    
    
    
}
