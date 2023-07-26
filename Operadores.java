package operadores;

public class Operadores {     
    int a;
    int b;
    
    //operaciones basicas
    
    public void sumar() {
        
        int resultado = a + b;
        System.out.println("La suma es: " + resultado);  
    }       
    
    public void resta() {
        
        int resultado = a - b;
        System.out.println("La resta es: " + resultado);
    }    
       
    public void multiplicar() {
        
        int resultado = a * b;
        System.out.println("La multiplicacion es: " + resultado);    
    }        
    
    public void dividir() {
        
        int resultado = a / b;
        System.out.println("La division es: " + resultado);   
    }
    
    //asignacion
    
    public void asignacionSuma(){
       
        int resultado = a+= b;
        System.out.println("La asignaciom suma es: " + resultado);  
    
    }
    
    public void asignacionResta(){
        
        int resultado = a-= b;
        System.out.println("La asignacion resta es: " + resultado);
    }    
       
    public void asignacionMultiplicar() {
        
        int resultado = a*= b;
        System.out.println("La asignacion multiplicacion es: " + resultado);    
    }        
    
    public void asignacionDividir() {
        
        int resultado = a/= b;
        System.out.println("La asignacion division es: " + resultado);   
    }
   
    //preincremento
    
    public void preincrementoSuma() {
        int resultado = ++a;
        System.out.println("El preincremento suma es: " + resultado);  
    }
    
    public void preincrementoResta() {
        int resultado = ++a;
        System.out.println("El preincremento resta es: " + resultado);  
    }
    
     public void posincrementoSuma() {
        int resultado = a++;
        System.out.println("El poscincremento suma es: " + resultado);   
    }
     
    public void posincrementoResta() {
        int resultado = a--;
        System.out.println("El posincremento resta es: " + resultado);  
    }
    
    //igualdad
    
    public void igualdad(){
        int a = 3;
        int b = 2;
        boolean c = (a == b);
        System.out.println("c = " +c);
        boolean d = a !=b;
        System.out.println("d = " +d);
        
        String cadena = "Adios";
        String cadena2 = "adios";
        boolean e = cadena == cadena2;
        System.out.println("e = " +e);
        boolean f = cadena.equals(cadena2);
        System.out.println("f = " +f);
    }
    
    //ternario
    
    public void ternario(){
        String resultado = (1>2)? "verdadera":"falsa";
        System.out.println("resultado: "+ resultado);
    }
    
    //ternario par
    
    public void ternarioPar (){
        String resultado = (2%2==0)? "par":"impar";
        System.out.println("resultado: "+ resultado);
    }
}
      
