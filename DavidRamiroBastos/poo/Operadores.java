
package poo;

public class Operadores {
    int a;
    int b;
    
    
    public void sumar(){
        int resultado = a+b;
        System.out.println("La suma es : " + resultado);
        
    }
    
    public void multiplicar(){
        int resultado = a*b;
        System.out.println("La multiplicacion es : " + resultado);
    }
    
    public void division(){
        int resultado = a/b;
        System.out.println("La division es : " + resultado);
       
    }
    
    public void boleano (){
        boolean resultado = a<b;
        System.out.println("Boolean es : " + resultado);
        
    }
    
    public void asignacionSumar (){
      int varA = a +=1;
      // a = a + 1
      System.out.println("a = " + varA);
        
      int varA1 = a +=3;
      System.out.println("a = " + varA1);
      
      int varA2 = a -=2;
      System.out.println("a = " + varA2);
      
      int varA3 = a *=2;
      System.out.println("a = " + varA3);
      
      int varA4 = a /=2;
      System.out.println("a = " + varA4);
      
      int varA5 = a %=2;
      System.out.println("a = " + varA5);
      
    }
    
    public void preincremento(){
        int incremento = ++a;
        System.out.println(incremento);
        
        int postincremento = b++;   
    }
    
    public void metodoTernario(){
       
        String parimpar = (2%2==0)? "par":"impar";
        System.out.println("parimpar: " + parimpar);
    }
}


