package EstructuraControl;

import java.util.Scanner;

public class Condicional {

    public static void ifel() {

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        if (num1 < num2) {
            System.out.println("Num1 es menor");
        } else if (num2 > num3) {
            System.out.println("Num2 es mayor");
        } else {
            System.out.println("Num3 es mayor");

        }
   
    }
    
    
    
    
   
    
     public static void comparar() {
        var numero = 4;
        var numeroTexto = "Numero desconocido";

        if (numero == 1) {
            numeroTexto = "Numero uno";
        } else if (numero == 2) {
            numeroTexto = "Numero dos";
        } else if (numero == 3) {
            numeroTexto = "Numero tres";
        } else if (numero == 4) {
            numeroTexto = "Numero cuatro";
        } else {
            System.out.println("Numero no encontrado");
        }
    }
     
     
     
     
     
     
     
     public static void estacionesDelaño(){
            Scanner est = new Scanner(System.in);
            System.out.println("Agrege el numero del mes que quiere comprobar");
            int mes = est.nextInt();
            String estacion = "Estacion desconocida";

        if(mes==1 || mes==2 || mes==12){
            estacion = "Invierno";
        }
        else if(mes==3 || mes==4 || mes==5){
            estacion = "Primavera";
        }
        else if(mes==6 || mes==7 || mes==8){
            
            estacion= "Verano";
        }
        else if(mes==9 || mes==10 || mes==11){
            estacion = "Otoño";
        }
            System.out.println("Estacion = " + estacion);       
}
     
     
     
     
     
        
        public static void casoSwitch(){
            Scanner caso = new Scanner (System.in);
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
                numeroTexto = "Numero cuatro";
                break; 
            default:
                numeroTexto = "Caso no encontrado";     
        }
        System.out.println("NumeroTexto =" + numeroTexto);
    }
        
        
        
        
    public static void frutas(){
   
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

  
     public static void whileee(){
         
     Scanner numeros  = new Scanner(System.in);
     System.out.println("digite un numero  ");
     int numero = numeros.nextInt();
     
//     int contador = 0;
     while(numero  < 100 ){
         System.out.println("contador = "+ numero );
         
         numero ++;
    
     } 
   
   }
     
     
     
   public static void login(){
    String clave = "Felipe16";
   
    String claveDigitada;
     
   
     
     
     do{
         Scanner guardarCl  = new Scanner(System.in);
          System.out.println("digite la clave   ");
          claveDigitada = guardarCl.nextLine();
         
         
         
     }while ( clave != claveDigitada);
     
       System.out.println("clave correcta ");
        
        
                  
    }   

}
