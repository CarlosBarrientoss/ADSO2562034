
package paqeuteciclofor;

public class For {
    int limite;
    int contadorPar;
    int contadorImpar;
    //public claseFor(){
    public For(int limite, int contadorPar, int contadorImpar){
        this.limite = limite;
        this.contadorPar = contadorPar;
        this.contadorImpar = contadorImpar;
    }


    public void numeroPares (){
        for( int i = 1; i <= limite; i++){
        if( i % 2 == 0 ){
           contadorPar++;
         System.out.println("El numero: " + i + "Es par");
            
        }else {
             contadorImpar++;
         System.out.println("El numero: " + 1 +"Es impar" );
        
        }
        
    }
         System.out.println("la cantidad de par es: " + contadorPar); 
          System.out.println("la cantidad de impar es: " + contadorImpar); 
    }

}

