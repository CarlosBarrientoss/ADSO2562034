public class Paralelogramo extends FiguraGeometrica{

    private double base;
    private double altura;
    private double lado;

    public Paralelogramo(double base, double altura, double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + lado);
    }
}
