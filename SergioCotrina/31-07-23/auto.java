
package domain;

public class auto {
    private String marca;
    private String placa;
    private String color;

    public auto (String marca, String placa, String color) {
        this.marca = marca;
        this.placa = placa;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
