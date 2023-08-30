import figures.*;

import java.util.Scanner;

public class FigureApp {
    public static void main(String[] args) {

        Scanner askData = new Scanner(System.in);

        IFigure circleModel = new CircleModel();
        IFigure hexagonModel = new HexagonModel();
        IFigure parallelogramModel = new ParallelogramModel();
        IFigure pentagonModel = new PentagonModel();
        IFigure rectangleModel = new RectangleModel();
        IFigure rhombusModel = new RhombusModel();
        IFigure squareModel = new SquareModel();
        IFigure trapeziumModel = new TrapeziumModel();
        IFigure triangleModel = new TriangleModel();

        System.out.println("Circulo:");
        circleModel.findArea(askData);
        circleModel.findPerimeter(askData);
        System.out.println("Hexagono:");
        hexagonModel.findArea(askData);
        hexagonModel.findPerimeter(askData);
        System.out.println("Paralelogramo:");
        parallelogramModel.findArea(askData);
        parallelogramModel.findPerimeter(askData);
        System.out.println("Pentagono:");
        pentagonModel.findArea(askData);
        pentagonModel.findPerimeter(askData);
        System.out.println("Rectangulo:");
        rectangleModel.findArea(askData);
        rectangleModel.findPerimeter(askData);
        System.out.println("Rombo:");
        rhombusModel.findArea(askData);
        rhombusModel.findPerimeter(askData);
        System.out.println("Cuadrado:");
        squareModel.findArea(askData);
        squareModel.findPerimeter(askData);
        System.out.println("Trapecio:");
        trapeziumModel.findArea(askData);
        trapeziumModel.findPerimeter(askData);
        System.out.println("Triangulo:");
        triangleModel.findArea(askData);
        triangleModel.findPerimeter(askData);

    }
}