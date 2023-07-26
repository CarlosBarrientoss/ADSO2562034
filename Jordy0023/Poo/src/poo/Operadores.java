package poo;

public class Operadores {

    int a;
    int b;

    public void sumar() {

        int resultado = a + b;
        System.out.println("la suma es " + resultado);

    }

    public void multiplicar() {

        int resultado = a * b;

        System.out.println("la multiplicacion es " + resultado);

    }

    public void division() {
        int resultado = a / b;
        System.out.println("la division es " + resultado);

    }

    public void boleano() {
        boolean resultado = a > b;
        System.out.println("el boolean es " + resultado);

    }

    public void operadoresAsignacion() {
        int asignacion1 = a += 1;
        // a= a + 1 
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
    //primero se incrementa la variable luego el valor 
    
     
     int e = 3;
     int f = ++e;
     
        System.out.println("e="+ e);
        System.out.println("f= "+ f);
        
      
    
    
    }
    
    public void postincremento(){
        
        // primero se utiliza el valor de la variable y despues se incrementa 
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
    
    public void operadorTernario(){
     String mayormenor = (2%2 == 0)? "mayor":"menor";
        System.out.println("mayor menor:"+ mayormenor);
             
             
             
 
             
    
        
    
    
    }

}
