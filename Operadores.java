
package poo;


public class Operadores {
int a;
int b;
int d;

public  void sumar(){
    int resultado = a+ b;
    System.out.println("La suma es: " + resultado);
}
 public void restar (){
     int resultado = a - b;
     System.out.println("la resta es: " + resultado);
 }   

 public void multiplicar (){
     int resultado = a * b;
     System.out.println("la multiplicacion  es: " + resultado);
     }
public void dividir (){
     int resultado = a / b;
     System.out.println("la division  es: " + resultado);

}

public void asignacionSuma (){
          a +=1;//a + 1
          System.out.println("a="+a);
}
public void asignacionSumar (){
          a +=3;//a + 3
          System.out.println("a"+a);
}
 public void asignacionRestar (){
          a -=2; // a - 2
          System.out.println("a="+a);
 }
public void asignacionMultiplicar (){
          a *=2; // a * 2
          System.out.println("a="+a);
}
public void asignacionDividir (){
    a /=2;// a / 2
          System.out.println("a="+a);
}
public void asignacionMod (){
          
          d %=2;// d % 2
          System.out.println("d="+d);
          

}



public void preIncremento(){
     int e = 3;
     int  f = ++e;
     
     System.out.println("e ="+e);
     System.out.println("f = "+f);
}

public void postIncremento(){
         
         int g = 5;
         int h = g++;
         System.out.println("g ="+g);
         System.out.println("h=" +h);
         
}
public void igualdad(){
       int j = 3;
       int k = 2;
       boolean n = (j == k);
       System.out.println("n =" + n);
       boolean l = j !=k;
       System.out.println("1 =" + 1);
}  
public void cadena (){
    String cadena = "Adios";
    String cadena2 = "adios";
    boolean p = cadena == cadena2;
    System.out.println("p = "+p);
    boolean m = cadena.equals(cadena2);
    System.out.println("m =" + m);
       
    
}
public void ternario (){
    
    String resultado = (a>b)?"verdadero":"falso";
    System.out.println("resultado = "+ resultado);
    
    int numero = d;
    
    resultado = (numero % 2 == 0)? "par": "impar";
    System.out.println("resultado  = " + resultado);


}



   
}



 
    
    

