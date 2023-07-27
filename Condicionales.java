/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasdeControl;

import java.util.Scanner;


public class Condicionales {
    
    public void condicionif(){
    int num1 = 10;
    int num2 = 20;
    int num3 = 30;
    
     if(num1 < num2){
       
      System.out.println("num1 es menor");
      
     }else if (num2 > num1){
         
      System.out.println("num2 es mayor");
      }else{
         
      System.out.println("num3 es mayor");
     }
    }
    
    public void conversion(){
     int numero = 4;
     String numeroTexto = "Numero desconocido" ;
     
     if (numero == 1){
      System.out.println( numeroTexto = "Numero uno");
     }else if (numero == 2){
      System.out.println(numeroTexto = "Numero dos");
     }else if (numero == 3){
      System.out.println(numeroTexto = "Numero tres");
     }else if (numero == 4){
      System.out.println(numeroTexto = "Numero cuatro");
     }else{
      System.out.println("Numero no encontrado");
     }
    }
    
    public void meses(){
     int mes = 4;
     String estacion = "Estacion desconocida";
     
     if(mes==1||mes==2||mes==12){
      System.out.println("Invierno ="+ estacion);
     }else if(mes==3||mes==4||mes==5){
      System.out.println("primavera ="+ estacion);
     }else if(mes==6||mes==7||mes==8){
      System.out.println("Verano ="+ estacion);
     }else if(mes==9||mes==10||mes==11){
      System.out.println("Otoño ="+ estacion);
     }
     System.out.println("estacion =" + estacion);
    }
    
    public void CondicionSwitch(){
     int numero = 5;
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
             numeroTexto = "Numero cuatro";
             break;
         default:
             numeroTexto = "Caso no encontrado";
     }
     System.out.println("numeroTexto =" + numeroTexto);
    } 
    
    public void estacionesSwitch(){
     int mes = 4;
     String estacion = "Estacion desconocida";
     
     switch(mes){
         case 1: case 2: case 12:
             estacion = "invierno";
             break;
         case 3: case 4: case 5:
             estacion = "primavera";
             break;
         case 6: case 7: case 8:
             estacion = "verano";
         case 9: case 10: case 11:
             estacion = "Otonio";
             break;
            }
     System.out.println("estacion ="+ estacion);
    }
    
    public void contador(){
        int contador = 0;
     
     while (contador < 3){
      System.out.println("contador ="+ contador);
      contador++;
     }
    }
    
    public void switchFruta(){
     Scanner frut = new Scanner (System.in);
     System.out.println("Escribe tu fruta favorita");
     String fruta = frut.nextLine();
     String frutaSistema = "Valor desconocido";
             
     switch(fruta){
         case "pera":
             frutaSistema = "Tu fruta favorita es la pera";
             break;
         case "fresa":
             frutaSistema = "Tu fruta favorita es la fresa";
             break;
         case "banana":
             frutaSistema = "Tu fruta favorita es la banana";
             break;
         case "mango":
             frutaSistema = "Tu fruta favorita es la mango";
             break;
         case "piña":
             frutaSistema = "Tu fruta favorita es la piña";
             break;
         default:
             frutaSistema = "fruta no encontrada";
     }      
     System.out.println(frutaSistema);
    }
    
    
    public void login(){
     int contrasena = 123;
     int contraing;
     
     do{
       Scanner scanner = new Scanner(System.in);
       System.out.println("Digite su contraseña");
       contraing = scanner.nextInt();
       
     }while(contrasena !=contraing);
     
     System.out.println("Ingreso al sistema");  
    }
}
