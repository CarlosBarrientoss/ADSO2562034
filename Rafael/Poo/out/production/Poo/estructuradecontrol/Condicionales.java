package estructuradecontrol;

import java.util.Scanner;

public class Condicionales {
    public void condicionIf(){
        var num1 = 10;
        var num2 = 20;
        var num3 = 30;

        if(num2 > num3){
            System.out.println("num2 es menor :");
        }else if (num1 > num3){
            System.out.println("num1 es mayor :");
        }else if(num1 > num2){
            System.out.println("num1 es mayor :");
        }else{
            System.out.println("num2 es mayor :");
        }
    }
    public void condicionalElseif(){
        var numero = 4;
        var numeroTexto = "Numero desconocido";
        if(numero == 1){
            numeroTexto="Numero uno";
        }else if(numero == 2){
            numeroTexto="Numero dos";
        }else if(numero == 3){
            numeroTexto="Numero tres";
        }else if(numero == 4){
            numeroTexto="Numero cuatro";
        }else{
            System.out.println("Numero no encontrado");
        }
    }
    public void estacion(){
        var mes = 4;
        var stacion = "estacion desconocida";
        if(mes == 1 || mes == 2 || mes == 12){
            stacion = "invierno";
        }else if( mes == 3 || mes == 4 || mes == 5){
            stacion = "primavera";
        }else if( mes == 6 || mes == 7 || mes == 8){
            stacion = " verano";
        }else if(mes == 9 || mes == 10 || mes == 11){
            stacion = "otoño";
        }
        System.out.println("Estacion = "+ stacion);
    }

    public void funcionSwitch(){
        var numero = 5;
        var numeroTexto = "valor desconocido";
        switch (numero){
            case 1:
                numeroTexto = "Numero uno";
                System.out.println("numeroTexto = " + numeroTexto);
                break;
            case 2:
                numeroTexto = "Numero dos";
                System.out.println("numeroTexto = " + numeroTexto);
                break;
            case 3:
                numeroTexto = "Numero tres";
                System.out.println("numeroTexto = " + numeroTexto);
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                System.out.println("numeroTexto = " + numeroTexto);
                break;
            case 5:
                numeroTexto = "Numero cinco";
                System.out.println("numeroTexto = " + numeroTexto);
                break;
            default:
                System.out.println(numeroTexto);
                break;
        }
    }

    public static void funcionSwitchp(){
        var numero = 5;
        var numeroTexto = "valor desconocido";
        switch (numero){
            case 1:
                numeroTexto = "Numero uno";
                System.out.println("numeroTexto = " + numeroTexto);
                break;
            case 2:
                numeroTexto = "Numero dos";
                System.out.println("numeroTexto = " + numeroTexto);
                break;
            case 3:
                numeroTexto = "Numero tres";
                System.out.println("numeroTexto = " + numeroTexto);
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                System.out.println("numeroTexto = " + numeroTexto);
                break;
            case 5:
                numeroTexto = "Numero cinco";
                System.out.println("numeroTexto = " + numeroTexto);
                break;
            default:
                System.out.println(numeroTexto);
                break;
        }
    }
    public void switchFrutal(){
        var fruta = "mango";
        var textoFruta = "Fruta desconocida";
        switch (fruta){
            case "uva":
                textoFruta = "uvitas";
                System.out.println(textoFruta);
                break;
            case "limon":
                textoFruta = "Lemon";
                System.out.println(textoFruta);
                break;
            case "mango":
                textoFruta = "Comiendo manguito de pana";
                System.out.println(textoFruta);
            default:
                System.out.println(textoFruta);
                break;
        }
    }
    public void metodoWhile(){
        var contador = 0;
        while(contador < 3){
            System.out.println("contador = " + contador);
            contador++;
        }
    }
    public void switchEstaciones(){
        var estaciones = "estacion desconocida";
        var mes = 4;
        switch (mes){
            case 1: case 2: case 12:
                estaciones = "invierno";
                System.out.println("La estacion es "+ estaciones);
                break;
            case 3: case 4: case 5:
                estaciones = "primavera";
                System.out.println("La estacion es "+ estaciones);
                break;
            case 6: case 7 : case 8:
                estaciones = "verano";
                System.out.println("La estacion es "+ estaciones);
                break;
            case 9: case 10 : case  11:
                estaciones = "otoño";
                System.out.println("La estacion es "+ estaciones);
                break;
            default:
                System.out.println(estaciones);
                break;
        }
    }
    public void loggIn(){
        var password = 123;
        int i = 0;
        do{
            System.out.println("Ingrese la contraseña");
            Scanner contraseña = new Scanner(System.in);
            var respuesta = contraseña.nextInt();
            if (respuesta == password){
                System.out.println("Contraseña correcta");
                break;
            }else{
                System.out.println("Contraseña incorrecta");
            }
        }while(i == 0);
    }
    public void LogIn(){
        var password = 123;
        int passwordIn;

        do {
            System.out.println("ingrese su clave");
            Scanner scanner = new Scanner(System.in);
            passwordIn = scanner.nextInt();

        }while (passwordIn != password);

        System.out.println("Contraseña correcta");




    }
    public void logInText(){
        var password = "brayan";
        String passwordIn;

        do {
            System.out.println("ingrese su clave");
            Scanner scanner = new Scanner(System.in);
            passwordIn = scanner.nextLine();

        }while (!passwordIn.equals(password));

        System.out.println("Contraseña correcta");




    }
}
