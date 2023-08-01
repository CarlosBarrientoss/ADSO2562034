
package poo;

public class Operaciones {
    
     int a;
     int b;
     
     
     public void sumar() {
         
         int resultado = a + b;
         System.out.println("La suma es: " + resultado);
     }
     
     public void multiplicar() {
         
         int resultado = a * b; 
         System.out.println("La multiplicacion es: " + resultado);
     }
    
     public void restar() {
         
         int resultado = a - b; 
         System.out.println("La resta es: " + resultado);
     }
     
     public void divison() {
         
         int resultado = a / b; 
         System.out.println("La divison es: " + resultado);
     }
     
     public void OperadorAsignacionSuma() {
         int resultado = a += 1;
         System.out.println("La asignacion es: " + resultado);
     }
     
     public void OperadorAsignacionResta() {
         int resultado = a -= 1;
         System.out.println("La asignacion es: " + resultado);
     }
     
     public void OperadorAsignacionMultiplicar() {
         int resultado = a *= 1;
         System.out.println("La asignacion es: " + resultado);
     }
     
     public void OperadorAsignacionDivision() {
         int resultado = a /= 1;
         System.out.println("La asignacion es: " + resultado);
     }
     
     
     public void Preincremento() {
         //primero se incrementa la variable y despues se usa su valor
         int resultado = ++a;
         System.out.println("El Preincremento es: " + resultado);
     }
     
      public void Posincremento() {
         //
         int resultado = a++;
         System.out.println("El Posincremento es: " + resultado);
     }
     
     public void Predecremento() {
         //
         int resultado = --a;
         System.out.println("El Predecremento: " + resultado);
     }
     
     public void Posdecremento() {
         //
         int resultado = a--;
         System.out.println("El Posdecremento " + resultado);
     }
     
     public void OperadoresIgualdad() {
         int resultadoSuma = a + b ;
         int resultadoResta = a - b ;
         int resultadoMultiplicar = a * b ;
         int resultadoDivision = a / b;
         
         
         if (resultadoSuma == resultadoResta) {
             System.out.println("El resultado de la suma es igual al resultado de la Resta ");
         }else {
            System.out.println("El resultado de la suma no es igual al resultado de la Resta ");
         }
         
         if (resultadoSuma == resultadoMultiplicar) {
             System.out.println("El resultado de la suma es igual al resultado de la Multiplicacion ");
         }else {
             System.out.println("El resultado de la suma no es igual al resultado de la  Multiplicacion ");
         }
         
         if (resultadoSuma == resultadoDivision) {
             System.out.println("El resultado de la suma es igual al resultado de la Division ");
         }else {
             System.out.println("El resultado de la suma no es igual al resultado de la  Division ");
         }
     }
     
     public void igual() {
          
         String cadena = "Adios";
         String cadena2 = "adios";
         boolean e = cadena == cadena2;
         System.out.println("e= "+ e);
         boolean f = cadena.equals(cadena2);
         System.out.println("f= "+ f);
     
     }
     
     public void OperadorTernario() {
     
         String resultado = (1<2)? "Verdadero" : "Falso";
         System.out.println("resultado = "+ resultado);
     
     }
     
 
}
