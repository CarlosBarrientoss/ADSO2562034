package poo;

public class Operadores {
    int a;
    int b;
    String cadenaUno;
    String cadenaDos;

    public void sumar(){
        int resultado = a + b;
        System.out.println("La suma es: "+ resultado);
    }
    public void multiplicar(){
        int resultado = a * b;
        System.out.println("La multiplicación es: "+ resultado);
    }
    public void resta(){
        int resultado = a - b;
        System.out.println("La resta es: "+ resultado);
    }
    public void dividir(){
        int resultado = a / b;
        System.out.println("La division es: "+ resultado);
    }
    public void asignacionSuma(){
        int resultado = a+=b;
        System.out.println("El resultado es: "+resultado);
    }
    public void asignacionResta(){
        int resultado = a-=b;
        System.out.println("El resultado es: "+resultado);
    }
    public void asignacionMultiplicar(){
        int resultado = a*=b;
        System.out.println("El resultado es: "+resultado);
    }
    public void asignacionDividir(){
        int resultado = a/=b;
        System.out.println("El resultado es: "+resultado);
    }
    public void asignacionModulo(){
        int resultado = a%=b;
        System.out.println("El resultado es: "+resultado);
    }
    public void preIncremento(){
        int resultado = ++a;
        System.out.println("El preincremento es: "+resultado);
    }
    public void preDecremento(){
        int resultado = --a;
        System.out.println("El predecremento es: "+resultado);
    }
    public void postIncremento(){
        int resultado = a++;
        System.out.println("El postincremento es: "+resultado);
    }
    public void postDecremento(){
        int resultado = a--;
        System.out.println("El postdecremento es: "+resultado);
    }
    public void opIgualdadEnteros(){
        boolean resultado = (a==b);
        System.out.println("Es igual?: "+resultado);
    }
    public void opDiferenciaEnteros(){
        boolean resultado = (a!=b);
        System.out.println("Es diferente?: "+resultado);
    }
    public void opIgualdadString(){
        boolean resultado = (cadenaUno==cadenaDos);
        System.out.println("Es igual?: "+resultado);
    }
    public void opIgualdadEquals(){
        boolean resultado = (cadenaUno.equals(cadenaDos));
        System.out.println("Es igual?: "+resultado);
    }
}
