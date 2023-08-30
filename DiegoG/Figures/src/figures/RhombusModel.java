package figures;

import java.util.Scanner;

public class RhombusModel implements IFigure{


    @Override
    public void findPerimeter(Scanner askSide) {
        System.out.println("Ingresa el area del rombo: ");
        double area = askSide.nextDouble();
        System.out.println("El perimetro del rombo es: " + area * 4);
    }

    @Override
    public void findArea(Scanner askType) {
        System.out.println("Ingresa las diagonales del rombo: ");
        System.out.println("Diagonal mayor: ");
        double majorDiagonal = askType.nextDouble();
        System.out.println("Diagonal menor: ");
        double minorDiagonal = askType.nextDouble();
        System.out.println("El area del rombo es: " + (majorDiagonal*minorDiagonal)/2);
    }
}