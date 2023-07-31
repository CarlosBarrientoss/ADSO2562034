
package paqueteciclofor;

public class For {
    
    int limite;
    int contadorPares;
    int contadorImpares;
    //public ClaseFor(){}
public For(int limite, int contadorPares, int contadorImpares){
        this.limite = limite;
        this.contadorPares = contadorPares;
        this.contadorImpares = contadorImpares;
}

public void numeroPares(){
        
        for(int i = 1; i<= limite; i++){
            if(i % 2 == 0){
                contadorPares++;
                //System.out.println("El numero: "+ i +" es par");
            }else{
                contadorImpares++;
                //System.out.println("El numero: "+ i +" es impar");
            }
        }
        System.out.println("La cantidad de numeros pares es: " + contadorPares);
        System.out.println("La cantidad de numeros impares es: " + contadorImpares);
    }

   

}