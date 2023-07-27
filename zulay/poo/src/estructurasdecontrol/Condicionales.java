package estructurasdecontrol;

import java.util.Scanner;

public class Condicionales {

    public void condicionIf() {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        if (num1 == 10) {
            System.out.println("diez");
        } else if (num2 == 20) {

            System.out.println("veinte");
        } else {
            System.out.println("treinta");
        }

    }

    public void elseIF() {
        int numero = 1;

        if (numero == 1) {
            System.out.println("numero uno");
        } else if (numero == 2) {
            System.out.println("numero dos");

        } else if (numero == 3) {
            System.out.println("numero tres");
        } else if (numero == 4) {
            System.out.println("numero cuatro");
        } else {
            System.out.println("numero no encontrado");
        }
    }

    public void estaciones() {
        Scanner meses = new Scanner(System.in);
        System.out.println("ingrese un mes");
        int mes = meses.nextInt();

        String estacion = "estacion desconocida";
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "otoño";
        }
        System.out.println("estacion " + estacion);
    }

    public void condicionalSwitch() {
        int num = 2;
        String numeroTexto = "valor desconocido";
        switch (num) {
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
                break;
            default:
                numeroTexto = "caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
    public void frutas() {
        int num = 2;
        String frutaTexto = "fruta desconocido";
        switch (num) {
            case 1:
                frutaTexto = "fresa";
                break;
            case 2:
                frutaTexto = "uva";
                break;
            case 3:
                frutaTexto = "mora";
                break;
            case 4:
                frutaTexto = "mango";
                break;
            default:
                frutaTexto = "fruta no encontrada";
        }
        System.out.println("frutaTexto = " + frutaTexto);
    }
    public void staciones(){
        int mes=4;
        String estacion="estacion desconocida";
        switch(mes){
            case 1:case 2: case 12:
                estacion="invierno";
                break;
            case 3:case 4: case 15:
                estacion="primavera";
                break;
            case 6:case 7: case 8:
                estacion="verano";
                break;    
            case 9:case 10: case 11:
                estacion="otoño";
                break;         
        }
        System.out.println("estacion = " + estacion);
    }
    public void condicionalWhile(){
        int contador=0;
        while(contador<3){
            System.out.println("contador = " + contador);
            contador++;
        }
    }
    public void doWhile(){
        int contador=0;
        do{
            System.out.println("contador = " + contador);
            contador++;
            
        }while(contador < 3);
    }
    public void login(){
        Scanner scanner=new Scanner(System.in);
        String contra=null;  
        String contraseña="2345";
        do{
         
            System.out.println("ingrese la contraseña");
           contra=scanner.nextLine();  
        }while(contra==contraseña);
    }

}
