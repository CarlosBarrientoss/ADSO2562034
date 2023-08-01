package encapsulamiento.domain;

public class VehiculoModel {
    private String motor;
    private String color;
    private boolean state;
    private String model;
    private Integer price;

    public VehiculoModel() {

    }

    public VehiculoModel(String motor, String color, boolean state, String model, Integer price) {
        this.motor = motor;
        this.color = color;
        this.state = state;
        this.model = model;
        this.price = price;
    }

    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
