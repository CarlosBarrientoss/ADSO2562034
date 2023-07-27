package operadores;

public class Operadores {
    int a;
    int b;
    
    //operaciones basicas
    
    public void sumar() {
        
        int resultado = a + b;
        System.out.println("La suma es : " + resultado);        
    }
    
    public void resta() {
        
        int resultado = a - b;
        System.out.println("La resta es : " + resultado);
    }
    
    public void multiplicar() {
        
        int resultado = a * b;
        System.out.println("La mulplicacion es : " + resultado);
    }
    
    public void divicion() {
        
        int resultado = a / b;
        System.out.println("la divicion es : " + resultado);
    }
    
    //asignaciones
    
    public void asignacionSuma() {
        int resultado = a+= b;
        System.out.println("la asignacion suma es : " + resultado);
    }
    
    public void asignacionResta() {
        int resultado = a-= b;
        System.out.println("la asignacion resta es : " + resultado);
    }
    
    public void asignacionMulti() {
        int resultado = a*= b;
        System.out.println("la asignacion multiplicacion es : " + resultado);
    }
    
    public void asignacionDivi() {
        int resultado = a/= b;
        System.out.println("la asignacion division es : " + resultado);
    }
    
    public void preIncrementoSum() {
        int resultado = ++a;
        System.out.println("El preincremento de suma es : " + resultado);
    }
    
    public void preIncrementoRes() {
        int resultado = --a;
        System.out.println("El preincremento de resta es : " + resultado);
    }
    
    public void postIncrementoSum() {
        int resultado = a++;
        System.out.println("El postincremento de suma es  : " + resultado);
    }
    
    public void postIncrementoRes() {
        int resultado = a--;
        System.out.println("El postincremento de resta es : " + resultado);
    }
    
    public void igualdad () {
        int a = 3;
        int b = 2;
        boolean c = (a == b);
        System.out.println("c = " + c);
        boolean d = a !=b;
        System.out.println("d = " + d);
        
        String cadena = "Adios";
        String cadena2 = "adios";
        boolean e = cadena == cadena2;
        System.out.println("e = " + e);
        boolean f = cadena.equals(cadena2);
        System.out.println("f = " + f);
    }
    
    public void ternario() {
        String resultado = (2%2==0)? "par":"impar";
        System.out.println("resultado: " + resultado);
    }
    
    public void ternarioPar() {
        String resultado = (2%2==0)? "par":"impar";
        System.out.println("resultado: " + resultado);
    }
}