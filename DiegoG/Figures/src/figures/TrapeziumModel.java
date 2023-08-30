package figures;

import java.util.Scanner;

public class TrapeziumModel implements IFigure {

    @Override
    public void findPerimeter(Scanner askSide) {
        System.out.println("Ingresa los lados del trapecio: ");
        System.out.println("Lados laterales: ");
        double sideLateral = askSide.nextDouble();
        System.out.println("Lado superior: ");
        double sideSuperior = askSide.nextDouble();
        System.out.println("Lado inferior: ");
        double sideInferior = askSide.nextDouble();
        System.out.println("El perimetro del circulo es de: " + (sideInferior + (sideLateral*2) + sideSuperior));
    }

    @Override
    public void findArea(Scanner askType) {
        System.out.println("Ingresa el lado superior del trapecio: ");
        double sideSuperior = askType.nextDouble();
        System.out.println("Ingresa el lado inferior del trapecio: ");
        double sideInferior = askType.nextDouble();
        System.out.println("Ingresa la altura del trapecio: ");
        double height = askType.nextDouble();
        System.out.println("El area del trapecio es: " + ((sideInferior * sideSuperior) * height)/2);
    }

}