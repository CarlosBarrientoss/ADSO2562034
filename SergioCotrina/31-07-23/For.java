package CicloFor;


public class For {
    int limite;
    int contadorpares;
    int contadoresimpares;
   
   
   
    //public For(){}
   
    public For (int limite, int contadorpares, int contadoresimpares){
        this.limite = limite;
        this.contadorpares = contadorpares;
        this.contadoresimpares = contadoresimpares;
   
}
    public void numerosPares(){
       
        for(int i = 1; i <= limite; i++){
            if(i % 2 == 0){
               
                contadorpares++;
                //System.out.println("El numero:" + i + "Es par");
        }else{
                contadoresimpares++;
                //System.out.println("El numero: " + i + "Es impar");
            }
        }
        System.out.println("la cantidad de numeros pares es : " + contadorpares);
        System.out.println("la cantidad de numeros impares es :"+ contadoresimpares);
       
    }

 
}