package domain;

public class VehicleModel {

    private String motor;
    private double velocidad;
    private String color;
    private int precio;
    private String modelo;
    private boolean state;


    public VehicleModel(String motor, double velocidad, String color, int precio, String modelo, boolean state) {
        this.motor = motor;
        this.velocidad = velocidad;
        this.color = color;
        this.precio = precio;
        this.modelo = modelo;
        this.state = state;
    }


    public String getMotor(){
        return this.motor;
    }

    public void setMotor(String Motor){
        this.motor = motor;
    }

    public double getVelocidad(){
        return this.velocidad;
    }

    public void setVelocidad(double Velocidad){
        this.velocidad = velocidad;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String Color){
        this.color = color;
    }

    public int getPrecio(){
        return this.precio;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public boolean isState() {
        return this.state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getState() {
        return null;
    }
}
