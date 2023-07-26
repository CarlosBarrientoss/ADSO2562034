
package poo;

public class Operadores {
   /* int a;
    int b;*/
    
    int a;
    int b;
    
    public int multiplicar(int a , int b){
        int result = a * b;
        return result;
        //System.out.print("resultado: " + result);    
    }   
    
   public void multiplicartwo(){
       int resulmulti = a*b;
       System.out.print(resulmulti);
   }
   
   
    public void sumar(){
        int resultTwo = a+b;
       
    }
    
    public void division(){
        int resultDivision = a%b;
    }
    
    public void resta(){
        int resultResta = a-b;
    }
   
    public void operadorsuma(){
        int resultado = a+=1;
        System.out.print("resultado"+resultado);  
    }
    
    public void operadorresta(){
        int resultado = a-=b;
    }
    
    public void operadormultiplicacion(){
        int resultado = a*=b;
    }
    
    public void preincremento(){
        int a = 2;
        int b = ++a;
        System.out.print("preicncremento " + b );
    }
    public void postincremento(){
        int a = 2;
        int b = --a;
        System.out.print("postincremento" + b);
        
        int c = 3;
        int d = c--;
        System.out.print("preincremento" + d);
    }
    public void operadorigualdadentero(){
        
       int a = 33;
       int b = 33;
       boolean c =(a==b);
       boolean secondC = (a!=b);
       
       System.out.print(c);
       
    }
    
    public void operadorIgualdadstring(){
       var a = "hola";
       var b = "hola";
       boolean c =(a==b);
       boolean secondc = (a!=b);
       System.out.print(c);
    }
    
    public void operadorTernario(){
        int a= 12;
        int b=17;
       
       int variable = (a > b) ? a : b;
       System.out.print(variable);
    }
    
}


// variable local,operadores de asignacion,preincremento,postdecremento