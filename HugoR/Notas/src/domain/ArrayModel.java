package domain;

public class ArrayModel {
    private double[] notas;

        public ArrayModel(double[] notas) {
        this.notas = notas;
        }

    public double calcularPromedio70(double[] notas) {
        double suma = 0.0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i] * 0.7;
        }
        return suma / notas.length;
    }

    public double calcularPromedio30(double[] notas) {
        double suma = 0.0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i] * 0.3;
        }
        return suma / notas.length;


}

}
