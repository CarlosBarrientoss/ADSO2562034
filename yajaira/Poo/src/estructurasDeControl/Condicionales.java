package estructurasDeControl;

import java.util.Scanner;

public class Condicionales {

    public void condicionIf() {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        if (num1 == 10) {
            System.out.println("diez ");
        } else if (num2 == 20) {
            System.out.println("veinte ");
        } else {
            System.out.println("treinta ");
        }
        //  if(!condicion){
        //    System.out.println("Falso");
        //  }

    }

    public void numeroD() {
        int numero = 4;

        if (numero == 1) {
            System.out.println("numero 1");
        } else if (numero == 2) {
            System.out.println("numero 2");
        } else if (numero == 3) {
            System.out.println("numero 3");
        } else if (numero == 4) {
            System.out.println("numero 4");
        } else {
            System.out.println("numero no encontrado");
        }

    }

    public void estaciones() {
        Scanner meses = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int mes = meses.nextInt();

        String estacion = "ESTACION DESCONOCIDA";
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "verano";

        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "otoño";

        }
        System.out.println("estacion = " + estacion);
    }

    public void casos() {
        int numero = 5;
        String numeroTexto = "valor desconocido";

        switch (numero) {
            case 1:
                numeroTexto = "numero uno";
                break;
            case 2:
                numeroTexto = "numero dos";
                break;
            case 3:
                numeroTexto = "numero tres";
                break;
            case 4:
                numeroTexto = "numero cuatro";
            default:
                numeroTexto = "caso no encontrado";
        }
        System.out.println("numeroTexto= " + numeroTexto);
    }

    public void estaci() {
        int mes = 4;
        String estacion = "estacion desconocida";

        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacion = "    invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "otoño";
                break;
        }
        System.out.println("estacion =" + estacion);
    }

    public void frutas() {
        int fruta = 5;
        String frutaTexto = "fruta desconocida";

        switch (fruta) {
            case 1:
                frutaTexto = "mango";
                break;
            case 2:
                frutaTexto = "banana";
                break;
            case 3:
                frutaTexto = "pera";
                break;
            case 4:
                frutaTexto = "fresa";
            default:
                frutaTexto = "fruta no encontrado";
        }
        System.out.println("fruta: " + frutaTexto);
    }

    public void whilel() {
        int contador = 1;
        while (contador < 1) {
            contador++;
            System.out.println("contador = " + contador);
        }
    }

    public void whiledo() {

        Scanner scanner = new Scanner(System.in);
        String contra = null;
        String contraseña = "1234";
        do {
            System.out.println("ingrese la contraseña");
            contra = scanner.nextLine();
        } while (contra == contraseña);
    }
}
