package figures;

import java.util.Scanner;

public class SquareModel implements IFigure {

    @Override
    public void findPerimeter(Scanner askSide) {
        System.out.println("Ingrese un lado del cuadrado: ");
        double side = askSide.nextDouble();
        System.out.println("El perimetro del cuadrado es de: " + side * 4);
    }

    @Override
    public void findArea(Scanner askType) {
        System.out.println("Ingresa otra vez un lado del cuadrado: ");
        double side = askType.nextDouble();
        System.out.println("El area del cuadrado es de: " + side * side);
    }
}