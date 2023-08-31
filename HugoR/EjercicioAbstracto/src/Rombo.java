public class Rombo extends FiguraGeometrica{

    private float diagonal1;
    private float diagonal2;
    private double lado;

    public Rombo(float diagonal1, float diagonal2, double lado) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (diagonal1*diagonal2)/2;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
