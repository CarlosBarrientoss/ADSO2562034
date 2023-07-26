package Poo;

public class Operadores {
    
          int a;
          int b;
          int d;

          public void sumar(){
          
              int resultado = a + b ;
              System.out.println("El suma es : " + resultado);
              
          }   
          
          public void restar(){
              int resultado = a - b ;
              System.out.println("la resta es :" + resultado);
              
          }
          
          public void multiplicar(){
              int resultado = a * b ;
              System.out.println("la multiplicacion es: " + resultado);
             
          }
          
          public void dividir(){
              int resultado = a / b ;
              System.out.println("la division es: " + resultado);
          }
          
          public void Asignacionsuma(){
              a +=1;//a +1
              System.out.println("a= "+a);
          }
        
          public void Asignacionresta(){
              a -=2;//a - 2
              System.out.println("a= "+a);
          }
          
          public void Asigancionmultiplicar(){
              a *=2;// a * 2
              System.out.println("a="+a);
          }
          
          public void Asignaciondividir(){
              a /=2;// a / 2
              System.out.println("a="+a);
          }
          
          public void AsignacionMod (){
              
              d %=2;// d % 2
              System.out.println("d="+d);
          }


         public void preIncrementoSum(){
             int resultado = a++;
             System.out.println("El preincremento de suma es :" + resultado);
         }
             
         public void preIncrementoRes(){
             int resultado = a--;
             System.out.println("El preincremento de la resta es :" + resultado);
         } 
             
            
         
         public void postIncrementoSum(){
             int resultado = a++;
             System.out.println("El postincremento de la suma es :" + resultado);
         }
         
         public void postIncrementoRes(){
             int resultado = a--;
             System.out.println("El postincremento de la resta es :" + resultado);
         }
         
         
         public void igualdad() {
             int a = 3;
             int b = 2;
             boolean c = (a == b);
             System.out.println("c = " + c);
             boolean d = a !=b;
             System.out.println("d =" + d);
             
             String cadena = "Adios";
             String cadena2 = "adios";
             boolean e = cadena.equals(cadena2);
             System.out.println("e = " + e);
             boolean f = cadena.equals (cadena2);
             System.out.println("f =" +f);
         }
         
         public void ternario(){
             String resultado = (2%2==0)? "par": "impar";
             System.out.println("resultado:" + resultado);
         }
         
         public void ternarioPar() {
             String resultado = (2%2==0)? "par": "impar";
             System.out.println("resultado:" + resultado);
         }
}
