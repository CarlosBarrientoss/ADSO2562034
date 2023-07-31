package ciclosford;

public class CiclosFord {

    static CiclosFord instancia2;

    int limite;
    int contador;
    int par;
    int impar;
    int contadorPar=1;
    int contadorImpar=1;

    public void numerosPares() {
        for (int i = 1; i <= limite; i++) {
            if (i % 2 == 0) {
                System.out.println("el numero " + i + "es par");
                impar = contadorImpar++;
            } else {
                System.out.println("el numero no es par");
                par = contadorPar++;
            }
        }
        System.out.println("Cantidad de numeros pares= " + impar);
        System.out.println("cantidad de numeros impares= " + par);
    }
    public CiclosFord(int limite,int impar,int par){
        this.limite=limite;
        this.contadorImpar=contadorImpar;
        this.contadorPar=contadorPar;
    }
    

}
