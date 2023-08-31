
public class Main {
    public static void main(String[] args) {

        FiguraGeometrica figura;
        figura = new Triangulo(10, 15);
        imprimirFigura(figura);

        figura = new Circulo(10);
        imprimirFigura(figura);

        figura = new Cuadrado(10);
        imprimirFigura(figura);

        figura = new Rectangulo(10,20);
        imprimirFigura(figura);

        figura = new Pentagono(10);
        imprimirFigura(figura);

        figura = new Rombo(6,5,4);
        imprimirFigura(figura);

        figura = new Trapecio(8,4,10,10,2);
        imprimirFigura(figura);

        figura = new Paralelogramo(9,11,16);
        imprimirFigura(figura);

        figura = new Hexagono(9);
        imprimirFigura(figura);
    }
    public static void imprimirFigura(FiguraGeometrica figura) {
        System.out.println();
        System.out.println("El area del " + figura.getClass().getSimpleName() + " es: " + figura.calcularArea());
        System.out.println("El perimetro del " + figura.getClass().getSimpleName() + " es: " + figura.calcularPerimetro());

    }

}