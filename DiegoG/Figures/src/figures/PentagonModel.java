package figures;

import java.util.Scanner;

public class PentagonModel implements IFigure{

    @Override
    public void findPerimeter(Scanner askSide) {
        System.out.println("Ingresa un lado del pentagono: ");
        double side = askSide.nextDouble();
        System.out.println("El perimetro del pentagono es: " + side*5);
    }

    @Override
    public void findArea(Scanner askType) {
        System.out.println("Ingresa el perimetro del pentagono: ");
        double perimeter = askType.nextDouble();
        System.out.println("Ingresa el area interna del pentagono: " );
        double area = askType.nextDouble();
        System.out.println("El area del pentagono es de: " + (perimeter*area)/2 );
    }
}