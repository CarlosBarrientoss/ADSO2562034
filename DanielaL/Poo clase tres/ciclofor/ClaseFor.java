package ciclofor;

import java.util.Scanner;

public class ClaseFor {

        int limite;
        int contadorImpares;
        int contadorpares;

    public ClaseFor(int limite, int contadorImpares, int contadorpares) {
        this.limite = limite;
        this.contadorImpares = contadorImpares;
        this.contadorpares = contadorpares;
    }

    public void numerosPares() {

        int i;
        for (i = 1; i <= limite; i++){
            if (i % 2 == 0) {
                System.out.println("Es numero " + i + " Es par");
                contadorpares++;
            } else {
                contadorImpares++;
                System.out.println("El numero " + i + " Es impar");
            }
        }



    }


    public int sumarConRetorno(int num1, int num2, int num3){
        int resultado = (num1 + num2 + num3);
        return resultado;
    }
}
