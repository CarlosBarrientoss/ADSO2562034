package poo;

public class Operadores {
    
    int a;
    int b;
    int d;
    
    public void sumar(){
        
        int resultado = a + b;
        System.out.println("La suma es: "+ resultado);
    }
    public void restar(){
        
        int resultado = a - b;
        System.out.println("La resta es: "+ resultado);
    }
    public void multiplicar(){
        
        int resultado = a * b;
        System.out.println("La multiplicacion es: "+ resultado);
    }
    public void dividir(){
        
        int resultado = a / b;
        System.out.println("La division es: "+ resultado);
    }
    
    public void asignacionSuma(){ 
        a +=1;//a = a + 1
        System.out.println("suma de uno mas = "+ a);
    }
    public void asignacionSumar(){
        a+=3;// a = a + 3
        System.out.println("suma de tres mas = "+ a);
    }
    public void asignacionRestar(){
        a -=2;//a = a - 2
        System.out.println("resta de 2 menos = "+ a);
    }
    public void asignacionMultiplicar(){
        a *=2;//a = a * 2
        System.out.println("multiplicado por dos = "+ a);
    }
    public void asignacionDividir(){
        a /=2;//a = a / 2
        System.out.println("divido por 2 = "+ a);
    }
    public void asignacionMod(){
        d %=2;//d = d % 2
        System.out.println("Mod de 2 = "+ d);
        
        boolean h = d % 2 == 0;
        if(h){
            System.out.println("es par");
        }else{
            System.out.println("es impar");
        }
    }
    public void preIncremento(){
        //primero se incrementa sun variable y despues se usa su valor
        var e = 3;
        var f = ++e;
        System.out.println("el valor e = "+ e);
        System.out.println("el valor f = "+ f);
    }
    public void postIncremento(){
        //primero se incrementa su valor y despues se usa su variable
        var g = 5;
        var h = g++;
        System.out.println("el valor g = "+ g);
        System.out.println("el valor h = "+ h);
    }
    public void preDecremento(){
        //primero se decremento sun variable y despues se usa su valor
        var r = 3;
        var t = --r;
        System.out.println("el valor r = "+ r);
        System.out.println("el valor t = "+ t);
    }
    public void postDecremento(){
        //primero se decremento sun valor y despues se usa su variable
        var x = 3;
        var y = x--;
        System.out.println("el valor e = "+ x);
        System.out.println("el valor f = "+ y);
    }
    public void igualdad(){
        var j = 3;
        var k = 2;
        var n = (j == k);
        System.out.println("n = "+ n);
        var l = j !=k;
        System.out.println("l = "+ l);        
    }
    public void cadena(){
        var cadena = "Adios";
        var cadena2 = "adios";
        var p = cadena == cadena2;
        System.out.println("p = "+ p);
        var m = cadena.equals(cadena2);
        System.out.println("m = "+ m);
    }
    public void ternario(){
        var resultado = (a > b)?"Verdadero":"Falso";
        System.out.println("Resultado = " + resultado);
        var numero = d;
        var resultados = (numero%2==0)?"par":"impar";
        System.out.println("Resultado 2 = " + resultados);
    }
}
