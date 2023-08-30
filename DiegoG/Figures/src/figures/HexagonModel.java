package figures;

import java.util.Scanner;

public class HexagonModel implements IFigure {

    @Override
    public void findPerimeter(Scanner askSide) {
        System.out.println("Ingresa un lado del hexagono: ");
        double side = askSide.nextDouble();
        System.out.println("El perimetro del hexagono es: " + side*6);
    }

    @Override
    public void findArea(Scanner askType) {
        System.out.println("Ingresa el perimetro del hexagono: ");
        double perimeter = askType.nextDouble();
        System.out.println("Ingresa el area interna del hexagono: " );
        double area = askType.nextDouble();
        System.out.println("El area del hexagono es de: " + (perimeter*area)/2 );
    }

}