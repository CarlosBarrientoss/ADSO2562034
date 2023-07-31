package cicloFor;

public class ClaseFor {
    int limite;
    int contadorPar;
    int contadorImpar;
    public void numerosPares(){
        for(int i = 1; i <= limite; i++){
            if(i% 2 == 0){
                System.out.println("El numero: "+ i + " es par");
                contadorPar++;
            }else{
                System.out.println("El numero: "+ i + " es impar");
                contadorImpar += 1;
            }
        }
        System.out.println("La cantidad de numeros pares es: "+ contadorPar);
        System.out.println("La cantidad de numeros impares es: "+ contadorImpar);
    }
}
