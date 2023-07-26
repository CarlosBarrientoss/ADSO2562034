package poo;

public class Operadores {
    
    int a;
    int b;
    
    public void sumar() {
        int resultado = a + b;
        System.out.println("la suma es = " + resultado);
        
    }
    
    public void multiplicar() {
        int resultado = a * b;
        System.out.println("la multiplicacion es = " + resultado);
        
    }
    
    public void dividir() {
        int resultado = a / b;
        System.out.println("la division es = " + resultado);
        
    }
    
    public void restar() {
        int resultado = a - b;
        System.out.println("la resta es = " + resultado);
    }
    
    public void operadorDeAsignacionSuma() {
        a += 1;
        System.out.println("operador de suma a: " + a);
    }
    
    public void operadorDeAsignacionResta() {
        a -= 1;
        System.out.println("operador de resta a: " + a);
    }
    
    public void operadorDeAsignacionMultiplicacion() {
        a *=1;
        System.out.println("operador de multiplicacion a:" + a);
    }
    
    public void operadorDeAsignacionDivision() {
        a /=1;
        System.out.println("operador de division a: " + a);
    }
    
    public void operadorDeAsignacionModulo() {
        a %=1;
        System.out.println("operador de modulo a: " + a);
    }

    //el preincremento el simbolo va antes de la variable
    public void preincremento() {
        int e = 3;
        int f = ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
    }
    //el postincremento el simbolo va despues de la variable

    public void postincremento() {
        int g = 3;
        int h = g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
    }

    public void igualdad() {
        int a = 3;
        int b = 2;
        boolean c = (a == b);
        System.out.println("c = " + c);
        boolean d = a != b;
        System.out.println("d = " + d);
        
        String cadena = "Adios";
        String cadena2 = "adios";
        boolean e = cadena == cadena2; //compara la referencia del objeto
        System.out.println("e = " + e);
        
        boolean f = cadena.equals(cadena2); //compara contenido de cadenas
        System.out.println("f = " + f);
        
    }

    public void operadorTernario() {
        String resultado = (1 > 2)?"verdadera":"falsa";
        System.out.println("resultado = " + resultado);
        
    }
    public void operadorTernarioPar() {
        String resultado = (2%2==0)?"par":"impar";
        System.out.println("resultado = " + resultado);
        
    }
}
