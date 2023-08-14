
package usuario;


public class ejercicio {
    public static void main(String[] args) {
        // Notas y ponderaciones
        double[] notas = { 3.0, 4.5, 5.0 };
        double[] ponderaciones = { 0.70, 0.70, 0.70 }; // 70% para cada nota
        double ponderacionExamenFinal = 0.30; // 30% para el examen final

        // Calcular promedio ponderado de las notas
        double sumaPonderadaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            sumaPonderadaNotas += notas[i] * ponderaciones[i];
        }

        // Nota del examen final
        double notaExamenFinal = 4.5;

        // Calcular la calificación final
        double calificacionFinal = (sumaPonderadaNotas + (notaExamenFinal * ponderacionExamenFinal)) / (ponderacionExamenFinal + sum(ponderaciones));

        System.out.println("Calificación final: " + calificacionFinal);
    }

    // Función auxiliar para sumar elementos en un arreglo
    public static double sum(double[] array) {
        double total = 0;
        for (double num : array) {
            total += num;
        }
        return total;
    }
}
