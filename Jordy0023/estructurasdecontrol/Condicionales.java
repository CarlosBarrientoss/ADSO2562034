package estructurasdecontrol;

import java.util.Scanner;

public class Condicionales {

    public void condicionIf() {

        Scanner num = new Scanner(System.in);
        System.out.println("digite un numero ");
        int num1 = num.nextInt();
        System.out.println("digite un numero ");
        int num2 = num.nextInt();
        System.out.println("digite un numero ");
        int num3 = num.nextInt();

        if (num1 > num2) {

            System.out.println("num1 es mayor " + num1);

        } else if (num2 > num3) {
            System.out.println("el num2 es mayor" + num2);
        } else {
            System.out.println("el num3 es mayor" + num3);

            if (num1 < num2) {
                System.out.println(" el num1 es el memor" + num1);

            }

        }
        System.out.println("---------------------------------------------");

    }

    public void condicionElseif() {

        Scanner numeros = new Scanner(System.in);
        System.out.println("digite un numero ");
        int numero = numeros.nextInt();
//        String numeroTexto = "numero desconocido ";

        if (numero == 1) {
            System.out.println("numero uno ");

        } else if (numero == 2) {

            System.out.println("numero dos ");
        } else if (numero == 3) {

            System.out.println("numero tres");

        } else if (numero == 4) {

            System.out.println("numero cuatro ");

        } else {

            System.out.println("numero no encontrado ");
        }
        System.out.println("----------------------------");

    }

    public static void estacion() {

        Scanner meses = new Scanner(System.in);

        System.out.println("digite un numero de mes  ");

        int mes = meses.nextInt();

        if (mes == 1 || mes == 2 || mes == 12) {

            System.out.println("invierno ");

        } else if (mes == 3 || mes == 4 || mes == 5) {
            System.out.println("Primavera ");

        } else if (mes == 6 || mes == 7 || mes == 8) {
            System.out.println("Verano ");

        } else if (mes == 9 || mes == 10 || mes == 11) {
            System.out.println("Otoño ");
        }

        System.out.println("---------------");

    }

    public static void switchh() {
        Scanner numer = new Scanner(System.in);
        System.out.println("digite un numero ");
        int numeritos = numer.nextInt();
        int numeros = 3;

        switch (numeritos) {
            case 1:
                System.out.println("numero uno ");
                break;

            case 2:
                System.out.println("numero dos");

                break;

            case 3:
                System.out.println("numero 3");
                break;

            case 4:

                System.out.println("numero 4");

            case 5:
                System.out.println("numero 5");

                break;
            default:
                System.out.println("numero no encontrado ");

                System.out.println("--------");

        }

    }

    public static void frutas() {

        Scanner frutal = new Scanner(System.in);
        System.out.println("Digite el nombre de una fruta ");
        String fruta = frutal.nextLine();

        switch (fruta) {
            case "naranja":
                System.out.println("frurta naranja ");
                break;

            case "fresa":
                System.out.println("fruta fresa");

                break;

            case "mango":
                System.out.println("fruta mango ");
                break;

            case "sandia":

                System.out.println("fruta sandia");

            case "pera":
                System.out.println("fruta pera");

                break;
            default:
                System.out.println("fruta no encontrada ");

                System.out.println("-----------");

        }

    }

    public static void whileee() {

        Scanner numeros = new Scanner(System.in);
        System.out.println("digite un numero  ");
        int numero = numeros.nextInt();

//     int contador = 0;
        while (numero < 100) {
            System.out.println("contador = " + numero);

            numero++;

        }

    }

    public static void login() {
        String clave = "jordy23";

        String claveDigitada;

        do {
            Scanner guardarCl = new Scanner(System.in);
            System.out.println("digite la clave   ");
            claveDigitada = guardarCl.nextLine();

            if (claveDigitada.equalsIgnoreCase(clave)) {
                System.out.println("clave correcta ");

            } else {
                System.out.println("clave incorrecta ");
            }

        } while (clave.equalsIgnoreCase(claveDigitada));

    }
}
