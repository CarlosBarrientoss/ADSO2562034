
package EstructurasdeControl;

import java.util.Scanner;

public class Condicionales {
    public void condicionIf () {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        
        if (num1 < num2){
                System.out.println("num1 es menor :");
        }else if (num2 > num3){
                System.out.println("num2 es mayor :");
        }else if(num2 < num3){
                System.out.println("num3 es mayor :");
                }
            
                    }
public void CondicionElseIf(){
           int numero = 4;
           String numeroTexto = "Numero desconocido";      
           
           if(numero == 1){
               System.out.println(numeroTexto = "Numero uno");
               
           }else if (numero == 2){
               System.out.println(numeroTexto = "Numero dos");
               
           }else if (numero == 3){
               System.out.println(numeroTexto = "Numero tres");
               
           }else if (numero == 4){
               System.out.println(numeroTexto = "Numero cuatro");
               
           }else{
               System.out.println("Numero no econtrado");
           }
}
        
      public void meses(){
          int mes = 4;
          String estacion = "Estacion desconocida";
          
          if(mes==1||mes==2||mes==12){
              System.out.println("invierno "+ estacion);
              
          }else if(mes==3||mes==4||mes==5){
              System.out.println("primavera" + estacion);
          }else if(mes==6||mes==7||mes==8){
              System.out.println("verano" + estacion);
          }else if(mes==9||mes==10||mes==11){
              System.out.println("otoño" + estacion);
              
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
          System.out.println("numeroTexto ="+numeroTexto);
          
      }
      
      public void switchFruta(){
          Scanner frut = new Scanner(System.in);
          System.out.println("Escribe tu fruta favorita");
          String fruta = frut.nextLine();
          String frutaSistema = "valor desconocido";
          
          switch(fruta){
              case "pera":
                  frutaSistema = "Tu fruta favorita es la pera";
                  break;
              case "fresa":
                  frutaSistema = "Tu Fruta favorita es la fresa";
                  break;
              case "banana":
                  frutaSistema = "Tu fruta favorita es la banana";
                  break;
              case "mango":
                  frutaSistema = "Tu fruta favorita es el mango";
                  break;
              case "piña":
                  frutaSistema = "Tu fruta favorita es la piña";
                  break;
              default:
                  frutaSistema = "Fruta no encontrada";
                  
          }
          System.out.println(frutaSistema);
      }
      
      public void cont() {
          int contador = 0;
          
          while(contador < 3){
              System.out.println("contador" + contador);
              contador ++;
          }
      }
      
      public void login(){
          int contrasena = 123;
          int contrasenaingresada;
          
          do {
              Scanner scanner = new Scanner(System.in);
              System.out.println("digite su contraseña =");
              contrasenaingresada = scanner.nextInt();
              
          }while (contrasena !=contrasenaingresada);
          
          System.out.println("ingreso al sistema");
         
      }
}
