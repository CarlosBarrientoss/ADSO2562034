package estructuraDeControl;
import java.util.Scanner;

//If y else 

public class Condicionales {
    public void condicionIf() {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        
        if(num1 < num2) {
            System.out.println("num1 es menor");
        }else if(num2 > num3) {
            System.out.println("num2 es mayor");    
        }else{
            System.out.println("num3 es mayor");
        }
        
    }
    
    public void compararNumero() {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        
        if(num1 == 10) {
           System.out.println("Diez");
        }else if(num2 == 20) {
            System.out.println("Veinte");
        }else{
            System.out.println("Treinta");
        }
    }
    
    public void comparar() {
        int numero = 4;
        String numeroTexto = "Numero desconocido";
        
        if(numero == 1){
            numeroTexto = "Numero uno";
        }else if(numero == 2){
            numeroTexto = "Numero dos";
        }else if(numero == 3){
            numeroTexto = "Numero tres";
        }else if(numero == 4){
            numeroTexto = "numero cuatro";
        }else{
            System.out.println("Numero no encontrado");
        }
    System.out.println(numeroTexto);
    }
    
    public void estacionesDelAño() {
        Scanner est = new Scanner(System.in);
        System.out.println("Agregue el numero del mes que quiere comprobar"); 
        int mes = est.nextInt();
        String estacion = "Estacion desconocida";
        
        if(mes == 1 || mes == 2 || mes == 12){
            estacion = "Invierno";
        }else if(mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        }else if(mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        }else if(mes == 9 || mes == 10 || mes == 11){
            estacion = "Otoño";
        }
    System.out.println(estacion);    
    }
    
    //Casos switch
    
    public void casoSwitch(){
        Scanner caso = new Scanner(System.in);
        System.out.println("Escribe un numero del 1 al 4");
        int numero = caso.nextInt();
        String numeroTexto = "Valor desconocido";
        
        switch(numero){
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuartro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
    System.out.println("numeroTexto = " + numeroTexto);    
    }
    
    public void switchEstaciones(){
        Scanner est = new Scanner(System.in);
        System.out.println("Escribe el numero del mes que quiere comprobar");
        int mes = est.nextInt();
        String estacion = "Estacion desconocida";
        
        switch(mes){
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Estacion no encontrada";
        }
    System.out.println(estacion);
    }
    
    public void switchFruta(){
        Scanner frut = new Scanner(System.in);
        System.out.println("Escribe tu fruta favorita");
        String fruta = frut.nextLine();
        String frutaSistema = "Valor desconocido";
        
        switch(fruta){
            case "mango":
                frutaSistema = "Tu fruta favorita es el mango";
                break;
            case "fresa":
                frutaSistema = "Tu fruta favorita es la fresa";
                break;
            case "Banana":
                frutaSistema = "Tu fruta favorita es la banana";
                break;
            case "piña":
                frutaSistema = "Tu fruta favorita es la piña";
                break;
            default:
                frutaSistema = "Fruta no encontrada";
        }
    System.out.println(frutaSistema);    
    }
    
    //While
    
    public void cont() {
        int contador = 0;
        
        while(contador < 3){
            System.out.println("contador " + contador);
            contador ++;
        }
    }
}   