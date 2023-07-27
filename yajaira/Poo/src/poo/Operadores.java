package poo;


public class Operadores {
    
    int a;
    int b;
    
    public void sumar(){
        int resultado = a + b;
        System.out.println("la suma es "+ resultado);
    }
    
    public void multiplicar(){
        int resultado = a * b;
        System.out.println("la multiplicacion es "+ resultado);
    } 
    
    public void restar(){
    int resultado = a - b;
    System.out.println("la resta es "+ resultado);
    }
    
    public void dividir(){
    int resultado = a / b;
    System.out.println("la division es "+ resultado);
    
    }
    
    public void operadorDeAsignacionSuma(){
        a+=1;
        b+=1;
        System.out.println("operador suma a: "+ a);
        System.out.println("operador suma b: "+ b);
    }
    
    public void operadorDeAsignacionResta(){
        a-=2;
        b-=2;
        System.out.println("operador resta a: "+ a);
        System.out.println("operador resta b: "+ b);
    }
    
    public void operadorDeAsignacionMultiplicacion(){
        a*=2;
        b*=2;
        System.out.println("operador multiplicar a: "+ a);
        System.out.println("operador multiplicar b: "+ b);
    } 
    public void operadorDeAsignacionDivision(){
        a/=2;
        b/=2;
        System.out.println("operador division a: "+ a);
        System.out.println("operador division b: "+ b);
    }
    public void operadorDeAsignacionModulo(){
        a%=2;
        b%=2;
        System.out.println("operador modulo a: "+ a);
        System.out.println("operador modulo b: "+ b);
    } 
    public void preincremento(){ //SIMBOLO ANTES DE LA VARIABLE
       
        int e = 3;
        int f = ++e; //primero se incrementa la variable y despues se usa valor 
        System.out.println("e = "+ e);
        System.out.println("f = "+ f);
        
    }
    
    public void postincremento(){ //SIMBOLO DESPUES DE LA VARIABLE
        int g = 5;
        int h = g++; //primero se utiliza el valor de la variable y despues se incrementa
        System.out.println("g = "+ g);
        System.out.println("h = "+ h);
        
    }
    
    public void igualdad (){
        int a = 3;
        int b = 2;
        boolean c = (a == b);
        System.out.println("c = "+c); //false
        boolean d = a !=b;
        System.out.println("d = "+d);
        
       String cadena = "Adios";
       String cadena2 = "adios";
       boolean e = cadena == cadena2; //compara la referencia del objeto
       System.out.println("e = "+e);
       boolean f = cadena.equals(cadena2); //compara contenido de cadenas
       System.out.println("f = "+f);
    }
    
    public void operadorTernario(){
        String resultado = (1>2)? "verdadera":"falsa";
        System.out.println("resultado: "+ resultado);
    }
    public void operadorTernarioPar(){
        String resultado = (2%2==0)? "par":"impar";
        System.out.println("resultado: "+ resultado);
        
        
    }
}

