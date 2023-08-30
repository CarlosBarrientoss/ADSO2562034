package figures;

import java.util.Scanner;

public class CircleModel implements IFigure{

    @Override
    public void findPerimeter(Scanner askSide) {
        System.out.println("Ingresa el diametro del circulo: ");
        double diameter = askSide.nextDouble();
        System.out.println("El perimetro del circulo es de: " + diameter * Math.PI);
    }

    @Override
    public void findArea(Scanner askType) {
        System.out.println("Ingresa el radio del circulo: ");
        double radio = askType.nextDouble();
        System.out.println("El area del circulo es: " + Math.PI*(radio*radio));
    }

}