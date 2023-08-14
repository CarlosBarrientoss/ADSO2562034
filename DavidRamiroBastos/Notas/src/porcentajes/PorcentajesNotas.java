
package porcentajes;
import notas.Notas;
public class PorcentajesNotas {
    public static double sumarNotas(double[] nota1){
        double suma = 0;
        for (int i = 0; i < nota1.length; i++) {
            suma += nota1[i]/nota1.length;
            
        }
        return suma;
    }
    
    public static double Porcentaje1(double suma, int x){
       return (suma * x )/100;
    }
    
    public static double notaFinal3(double x, double y){
        return x+y;
    }
}
   