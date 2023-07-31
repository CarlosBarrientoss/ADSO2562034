//
package PaqueteicloFor;


public class ClaseFor {
    
    int limite;
    int contadorpar;
    int contadorimpar;
    
    
    
    
    
    public ClaseFor(int limite, int contadorpar, int contadorimpar){
        this.limite = limite;
        this.contadorimpar = contadorimpar;
        this.contadorpar = contadorpar;
    
    
}
    
    
    public void numerosPares(){
        for(int i = 1; i <= limite; i++){
            if(i % 2 == 0){
               // System.out.println("el numero: " + i + "es par");
                contadorpar++;
                
                
            }
            else{
                //System.out.println("el numero: " + i + "es impar");
                contadorimpar++;
            }
            
            System.out.println(" la cantidad de par es: " + contadorpar);
            System.out.println(" la cantidad de impar es: "+ contadorimpar);
            
        }
    }

 
   
    
}
