
package domain;


public class Vehiculomodel {
    private String Motor;
    private Double color;
    private String price;
    private boolean state;

    public Vehiculomodel(String Motor, Double precio, String color, boolean state) {
        this.Motor = Motor;
        this.color = precio;
        this.price = color;
        this.state = state;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String Motor) {
        this.Motor = Motor;
    }

    public Double getColor() {
        return color;
    }

    public void setColor(Double color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    
    
    
    
}
