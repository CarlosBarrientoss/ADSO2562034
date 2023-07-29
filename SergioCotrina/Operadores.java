package PooOperadores;
public class Operadores {
    
          int a;
          int b;
         
          public void sumar(){
          
              int resultado = a + b ;
              
              System.out.println("El resultado es : " + resultado);
          }    
          
          public void restar(){
          
              int resultado = a - b ;
              
              System.out.println("El resultado es : " + resultado);
          }    
          
          public void multiplicar(){
          
              int resultado = a * b ;
              
              System.out.println("El resultado es : " + resultado);
          }    
          
          public void dividir(){
          
              int resultado = a / b ;
              
              System.out.println("El resultado es : " + resultado);
          }    
            public void preIncremento() {

            int e = 3;
            int f = ++e;
            
            System.out.println("e =" + e);
            System.out.println("f =" +f);
          }
            
          public void Asignacionsuma(){
              a +=1;//a +1
              System.out.println("a= "+a);
          }
          
          public void Asignacionresta(){
              a -=2;//a - 2
              System.out.println("a= "+a);
          }
          
          public void Asignacionmultiplicacion(){
              a *=2;//a * 2
              System.out.println("a= "+a);
          }
          
          public void Asignaciondividir(){
              a /=2;//a / 2
              System.out.println("a= "+a);
          }
          
          public void AsignacionMod(){
              a %=2;//a %2
              System.out.println("a= "+a);
          }
}