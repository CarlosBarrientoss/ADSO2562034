public class Trapecio extends FiguraGeometrica{
    private double baseMayor;
    private double baseMenor;
    private double ladoLateralIzquierdo;
    private double ladoLateralDerecho;
    private double altura;

    public Trapecio(double baseMayor, double baseMenor, double ladoLateralIzquierdo, double ladoLateralDerecho, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.ladoLateralIzquierdo = ladoLateralIzquierdo;
        this.ladoLateralDerecho = ladoLateralDerecho;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return baseMayor + baseMenor * altura / 2;
    }

    @Override
    public double calcularPerimetro() {
        return baseMayor + baseMenor + ladoLateralIzquierdo + ladoLateralDerecho;
    }
}
