package figures;

import java.util.Scanner;

public class RectangleModel implements IFigure {

    @Override
    public void findPerimeter(Scanner askSide) {
        System.out.println("Ingresa la altura y la base del rectangulo: " );
        System.out.println("Altura: ");
        double height = askSide.nextDouble();
        System.out.println("Base: ");
        double base = askSide.nextDouble();
        System.out.println("El perimetro del rectangulo es de: " + ((height * 2)+ (base*2)));
    }

    @Override
    public void findArea(Scanner askType) {
        System.out.println("Para el area, ingresa la altura y la base del rectangulo: " );
        System.out.println("Altura: ");
        double height = askType.nextDouble();
        System.out.println("Base: ");
        double base = askType.nextDouble();
        System.out.println("El area del rectangulo es de: " + height*base);
    }

}
