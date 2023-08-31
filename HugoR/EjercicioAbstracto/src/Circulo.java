import static java.lang.Math.PI;

public class Circulo extends FiguraGeometrica{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * radio * radio ;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }
}
