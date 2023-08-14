import porcentajes.PorcentajesNotas;
public class TestApp extends PorcentajesNotas{
    public static void main(String[] args) {
//        Notas notas1 = new Notas(3.0, 4.5, 5.0, 4.5);
//        System.out.println(notas1);
        
        double[] notas1 = {5.0,5.0,5.0,5.0}; 
        double notaFinal = 5.0;
        double treintaPorciento = Porcentaje1(notaFinal,30);
        System.out.println("treintaPorciento = " + treintaPorciento);
        
        double resultado = sumarNotas(notas1);
//        System.out.println("resultado = " + resultado);
       
          
        double setentaPorciento = Porcentaje1(resultado,70);
        System.out.println("setentaPorciento = " + setentaPorciento);
        
        double notaFina2 = notaFinal3(treintaPorciento,setentaPorciento);
        System.out.println("nota definitiva = " + notaFina2);
        } 
}
