package operadores;

public class Operadores {
    
    int a;
    int b;

    public void sumar() {
        int resultado = a + b;
        System.out.println("La suma es :" + resultado);        
    }
    
    public void restar() {
        int resultado = a - b;
        System.out.println("La resta es :" + resultado);
    }
    
    public void multiplicar() {
        int resultado = a * b;
        System.out.println("La divison es :" + resultado);
    }
    
    public void dividir() {
        int resultado = a / b;
        System.out.println("La division es :" + resultado);
    }
    public void Asignacionsuma(){
              a +=1;//a +1
              System.out.println("a= "+a);
    }
       
    public void Asignacionresta(){
              a -=2;//a - 2
              System.out.println("a= "+a);
    }
         
    public void Asigancionmultiplicar(){
              a *=2;// a * 2
              System.out.println("a="+a);
    }
         
    public void Asignaciondividir(){
              a /=2;// a / 2
              System.out.println("a="+a);
    }
         
    public void AsignacionMod (){
             
              d %=2;// d % 2;
              System.out.println("d="+d);
    }
    public void preIncrementoSum(){
             int resultado = a++;
             System.out.println("El preincremento :" + resultado);
             
             
             int f = ++e;
             
             System.out.println("e = " + e);
             System.out.println("f =" +f);
    }
         
         public void

}
