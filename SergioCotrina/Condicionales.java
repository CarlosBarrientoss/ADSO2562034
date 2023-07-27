
package EstructurasDeControl;

import static java.time.Clock.system;
import java.util.Scanner;

public class Condicionales {
    public void condicionIf() {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        if (num1 < num2) {
            System.out.println("Numero 1 es menor");
        }else if (num2 > num3) {
            System.out.println("Numero 2 es mayor");
        }else if (num2 < num3 ) {
            System.out.println("Numero 3 es mayor");
    
    }
}
    public void CondicionElseIf() {
        int numero = 4;
        String numeroTexto = "Numero Desconocido";
        
          if(numero == 1){
              System.out.println(numeroTexto="Numero uno");
          }else if (numero == 2){
              System.out.println(numeroTexto="Numero dos");
          }else if (numero == 3){
              System.out.println(numeroTexto="Numero tres");
          }else if (numero == 4){
              System.out.println(numeroTexto="Numero cuatro");
          }else{
              System.out.println("Numero no encontrado");
          }
    }
    
    public void meses(){
        int mes = 4;
        String estacion = "Estacion desconocida";
        
        if(mes==1||mes==2||mes==12){
            System.out.println("Invierno" + estacion);
        }else if (mes==3||mes==4||mes==5){
            System.out.println("Primavera" + estacion);
        }else if (mes==6||mes==7||mes==8){
            System.out.println("Verano"+estacion);
        }else if (mes==9||mes==10||mes==11){
            System.out.println("Otoño" + estacion);
        }
    }     
    public void CondicionSwitch(){
        int numero = 5;
        String numeroTexto = "Valor desconocido";
        
        switch(numero){
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos ";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;  
            default:
                numeroTexto = "Caso no encontrado";
        }
    }
    public void EstacionesSwitch(){
        int mes = 4;
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
        }
        System.out.println("estacion =" + estacion);
    }
    public void switchFruta(){
        Scanner frut = new Scanner (System.in);
        System.out.println("Escribe tu fruta favorita");
        String fruta = frut.nextLine();
        String frutaSistema = "Valor desconocido";
        
        switch(fruta){
            case "Fresa":
                frutaSistema = "Tu fruta favorita es la Fresa";
            break;
            case "Pera":
                frutaSistema = "Tu fruta favorita es la Pera";
            break;
            case "Banana":
                frutaSistema = "Tu fruta favorita es la Banana";
            break;
            case "Mango":
                frutaSistema = "Tu fruta favorita es el mango";
            break;
            case "Piña":
                frutaSistema = "Tu fruta favorita es la Piña";
            break;
            default:
                frutaSistema = "Fruta no encontrada";
        }
    }
    public void Contador(){
        int contador = 0;
        while(contador<3){
            System.out.println("contador=" + contador);
            contador++;
        }
    }
    public void whileContador(){
        int contador = 0;
        do{
            System.out.println("Contador  = "+ contador);
            contador++;
        }while (contador<3);
    }
    public void Login(){
        int contrasena = 123;
        int contrasenaIngresada;
        
        do{
            Scanner scanner = new Scanner (System.in);
            System.out.println("Digite su contraseña =");
            contrasenaIngresada = scanner.nextInt();        
        }while (contrasena!= contrasenaIngresada);
        System.out.println("Ingresó al sistema");
    }
}
