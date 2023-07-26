package poo;

public class Operadores {
    
    int a;
    int b;
    
    public void sumar(){
        int resultado = a+b;
        System.out.println("La suma es: " + resultado);
        
  }
      public void multiplicar(){
        int resultado = a*b;
        System.out.println("La multiplicación es: " + resultado);
      }
   
      public void division(){
        int resultado = a/b;
          System.out.println("La división es: " + resultado);
      }
      
      public void booleano(){
        boolean resultado = a > b;
        System.out.println("El valor booleano es: " + resultado);
      }
      
      public void operadoresAsignacion() {
        int asignacion1 = a += 1;
        System.out.println(asignacion1);

        int asignacion2 = a += 3;
        System.out.println(asignacion2);
        
        int asignacion3 = a -=2;
        System.out.println(asignacion3);
        
        int asignacion4 = a *=2;
        System.out.println(asignacion4);
        
        int asignacion5 = a /=2;
        System.out.println(asignacion5);
        
        int asignacion6 = b %=2;
        System.out.println(asignacion6);
      }
      
    public void preincremento(){

     int e = 3;
     int f = ++e;
     
        System.out.println("e="+ e);
        System.out.println("f= "+ f);
    }
    
    public void postincremento(){
        
    int g = 5;
    int h= g++ ;
    
        System.out.println("g= "+ g);
        System.out.println("h= "+h);
    }
    
    public void comparacion(){
    String cadena="hola";
    String cadena2 = "hola";
    
       boolean x =cadena.equals(cadena2);
        System.out.println("x="+x);
    }
    
    public void OperadorTernario(){;
     String parimpar = (2%2 ==0)? "par" : "impar";
    System.out.println("resultado = " + parimpar);
    
    }
    
}