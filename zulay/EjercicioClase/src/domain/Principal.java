package domain;

public class Principal {

    public static Double nota(Double []notas) {
        Double resultado=0.0;
        for (Double nota: notas) {
            resultado+=nota;
            
        }
        return (resultado*0.7)/notas.length;

       

    }
    public static Double  Examen(Double nota){
        
        double promedioNota=nota*0.3;
        return promedioNota;
    }

}
