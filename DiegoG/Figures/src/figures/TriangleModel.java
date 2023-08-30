package figures;

import java.util.Scanner;

public class TriangleModel implements IFigure{

    @Override
    public void findPerimeter(Scanner askSide) {
        System.out.println("Ingrese los lados del triangulo: ");
        System.out.println("Lado 1: ");
        double side1 = askSide.nextDouble();
        System.out.println("Lado 2: ");
        double side2 = askSide.nextDouble();
        System.out.println("Lado 3: ");
        double side3 = askSide.nextDouble();
        System.out.println("El perimetro del triangulo es: " + (side1 + side2 + side3));
    }

    @Override
    public void findArea(Scanner askType) {
        System.out.println("Ingrese la base del triangulo: ");
        double base = askType.nextDouble();
        System.out.println("Ingrese la altura del triangulo: ");
        double height = askType.nextDouble();
        System.out.println("El area del triangulo es: " + (base * height)/2 );
    }

}