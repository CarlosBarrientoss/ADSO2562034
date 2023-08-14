package test;
import domain.ArrayModel;
public class ArrayApp extends ArrayModel {

    public ArrayApp(double[] notas) {
        super(notas);
    }




    public static void main(String[] args) {
        double[] notas = {3.0, 4.5, 5.0};
        ArrayModel ArrayModel = new ArrayModel(notas);


        double promedio70 = ArrayModel.calcularPromedio70(notas);
        double promedio30 = ArrayModel.calcularPromedio30(notas);

        System.out.println("El Promedio 70%: " + promedio70);
        System.out.println("El Promedio 30%: " + promedio30);

        double examenFinal = 4.5;
        double notaFinal = (promedio70 * 0.7) + (examenFinal * 0.3);
        System.out.println("Nota final: " + notaFinal);





    }
}
