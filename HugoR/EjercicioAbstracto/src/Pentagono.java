public class Pentagono extends FiguraGeometrica{

    private int lado;

    public Pentagono(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return 5*lado;
    }


    @Override
    public double calcularArea() {
        return calcularPerimetro()/2;
    }

}
