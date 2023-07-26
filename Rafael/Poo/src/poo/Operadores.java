package poo;

import java.sql.SQLOutput;

public class Operadores {
    int a;
    int b;
    int d = 10;
    public void sumar(){
        int resultado = a + b;
        System.out.println("La suma de los numeros es "+ resultado);
    }
    public void resta(){
        int resultResta = a - b;
        System.out.println("La resta de los numeros es "+ resultResta);
    }
    public void multiplicar(){
        int resultMultiplicar = a * b;
        System.out.println("La multiplicacion de los numeros es "+ resultMultiplicar);
    }
    public void dividir(){
        int resultDividir = a / b;
        System.out.println("La division de los numeros es "+ resultDividir);
    }
    public void asignacionSuma(){
        a += 1;//a = a + 1
        System.out.println("a = "+ a);
        a += 3;// a = a + 3
        System.out.println("a = "+ a);
    }
    public void asignacionResta(){
        a -=2;// a = a - 2
        System.out.println("a = "+ a);
    }
    public  void asignacionMultiplicar(){
        a *= 2;// a = a * 2
        System.out.println("a = "+ a);
    }
    public void asignacionDividir(){
        a /= 2; //a = a / 2
        System.out.println("a = "+ a);
    }
    public void asignacionMod() {
        boolean h = d % 2 == 0; // d

        if (h)
            System.out.println("Es par");
        else
            System.out.println("Es par");
    }
    public void asignacion(){
        d %= 2;
        System.out.println("d = "+ d);
    }
    public void preincremento(){
        //primero se incrementa la variable y despue se usa su valor
        int e = 3;
        int f = ++e;
        System.out.println("e = "+ e);
        System.out.println("f = "+ f);
    }
    public void postincremento(){
        // primero se utiliza el valor de a variable y despues se incrementa
        int g = 5;
        int h = g++;
        System.out.println("g = "+ g);
        System.out.println("h = "+ h);
    }
    public void preDecremento(){
        int z = 3;
        int w = --z;
        System.out.println("z = "+ z);
        System.out.println("w = "+ w);
    }
    public void postDecremento(){
        int q = 3;
        int l = q--;
        System.out.println("q = "+q);
        System.out.println("l = "+ l);
    }
    public  void igualdadEnteros(){
        int a = 3;
        int b = 2;
        boolean c = (a == b);
        System.out.println("c = "+ c);
        boolean d = a != b;
        System.out.println("d = "+ d);
    }
    public void igualdadCadena(){
        String cadena = "Adios";
        String cadena2 = "adios";
        boolean p = cadena == cadena2;
        System.out.println("p = "+p);
        boolean f = cadena.equals(cadena2);
        System.out.println("f = "+ f);
    }
    public void ternario(){
        var resultado = (a > b)? "verdadero" : "falso";
        System.out.println("resultado = "+ resultado);

        var numero = 9;
        var resultado2 = (numero % 2 == 0)? "par" : "impar";
        System.out.println("resultado2 = "+ resultado2);

    }
}
