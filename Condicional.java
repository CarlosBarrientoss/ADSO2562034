package EstructuraControl;

import java.util.Scanner;

public class Condicional {
        
    public void CondicionalNum(){
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        
        if (num1 < num2){
            System.out.println("Num1 es menor");
        }
        
        else if (num2 > num3){
            System.out.println("Num2 es mayor");
        }
        
        else{
            System.out.println("Num3 es mayor");
        }
        System.out.println("------------------------");
    }
    
    public static void comparar(){
        int numero = 4;
        String numeroTexto = "Número desconocido";
        
        if (numero == 1){
            numeroTexto = "Número uno";
        }
        else if (numero == 2){
            numeroTexto = "Número dos";
    }
        else if (numero == 3){
            numeroTexto = "Número tres";
        }
        else if (numero == 4){
            numeroTexto = "Número cuatro";
        }
        else{
            System.out.println("Número no encontrado");
        }
    }
    
    public static void estacionesdelaño(){
        Scanner est = new Scanner(System.in);
        System.out.println("Ingrese el número del mes que quiere comprobar: ");
        int mes = est.nextInt();
        String estacion = "Estación desconocida";
        
        if(mes == 1 || mes == 2 || mes == 12){
            estacion = "Invierno";
        }
        else if (mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        }
        else if (mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        }
        else if (mes == 9 || mes == 10 || mes == 11){
            estacion = "Otoño";
        }
        System.out.println("Estacion = " + estacion);
    }
    
    public static void casoSwitch(){
    Scanner caso = new Scanner("System.in");
    System.out.println("Ingresa un número del 1 al 4");
    int numero = caso.nextInt();
    String numeroTexto = "Valor desconocido";
    
    switch (numero){
        case 1:
            numeroTexto = "Número uno";
            break;
            
        case 2:
            numeroTexto = "Número dos";
            break;
            
        case 3:
            numeroTexto = "Número tres";
            break;
            
        case 4:
            numeroTexto = "Número cuatro";
            break;
            
        default:
            numeroTexto = "Caso no encontrado";
        }
        System.out.println("NumeroTexto = " + numeroTexto);
    }
    
    public static void frutas(){
    Scanner frutas = new Scanner(System.in);
    System.out.println("Ingresa el nombre de alguna fruta: ");
    String fruta = frutas.nextLine();
    
    switch (fruta){
        case "naranja":
        System.out.println("Fruta Naranja");
        break;
        
        case "fresa":
        System.out.println("Fruta Fresa");
        break;
        
        case "mango":
        System.out.println("Fruta Mango");
        break;
        
        case "sandia":
        System.out.println("Fruta Sandia");
        break;
        
        case "pera":
        System.out.println("Fruta Pera");
        break;
        
        default: 
            System.out.println("Fruta no encontrada");
        }
    }
    
    public static void whileee(){
    Scanner numeros = new Scanner(System.in);
    System.out.println("Ingrese un número: ");
    int numero = numeros.nextInt();
    }
    
    public static void login(){
    String clave = "Santiagoramirez17*";
    String claveDigitada;
    
    do {
    Scanner guardarCl = new Scanner(System.in);
    System.out.println("Ingresa la clave: ");
    claveDigitada = guardarCl.nextLine();
    }
    
    while (!clave.equals(claveDigitada));
    System.out.println("La clave ingresada es correcta: ");
    }
}