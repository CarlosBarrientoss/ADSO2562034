
package EstructuraDeControl;

import java.util.Scanner;

public class Condicionales {
    
    public void CondicionIf(){
        
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        
       if(num1<num2){
           System.out.println("num1 es menor :" + num1);
       }
       else if (num2 > num3){
           System.out.println("num2 es mayor :" + num2);
       }
       else{
           System.out.println("num3 es mayor" + num3);
       }
       
           
       }
    
    public void Conversion(){
        int numero = 4;
        String numeroTexto = " Numero desconocido";
        
        if(numero == 1){
            numeroTexto = "Numero uno";
        }
        else if (numero == 2){
            numeroTexto = "Numero dos";
        }
        else if(numero == 3){
            numeroTexto = "Numero tres";
        }
        else if (numero == 4){
            numeroTexto = "Numero cuatro";
        }
        else{
            System.out.println("Numero no encontrado");
        }
      
        
           
      
 
    }
    
    public void Estaciones (){
        int mes = 4;
        String Estacion =" Estacion desconocida";
        
        if(mes == 1 || mes == 2 || mes == 12){
            Estacion = "invierno";
        }
        else if (mes == 3 || mes == 4 || mes ==5){
            Estacion = "Primavera";
        }
        else if (mes == 6 || mes == 7 || mes == 8){
            Estacion = "Verano";
        }
        else if (mes == 9 || mes == 10 || mes == 11){
            Estacion = "Otonio";
        }
        System.out.println("Estacion =" + Estacion);
    }
    
    
    public void CondicionesSwitch (){
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
        System.out.println("numeroTexto = " + numeroTexto);
    }
    
    public void switchFrutas (){
        Scanner frut = new Scanner(System.in);
        System.out.println("escribe la fruta:");
        String fruta = frut.nextLine();
        String frutaSistema= " valor desconocido";
        
        switch(fruta){
            case "pera":
                frutaSistema= "su fruta es";
                break;
            case "manzana":
                frutaSistema = "su fruta es";
                break;
            case "mango":
                frutaSistema = "su fruta es";
                break;
            case "piña":
                frutaSistema = "su fruta es";
            default:
                frutaSistema = "fruta no encontrada";
                
        }
        
        System.out.println(frutaSistema);
    }
    
   
    
    
    
    
    
    
  
    public void CondicionWhaile (){
        int contador = 0;
        while(contador<3){
        System.out.println("contador =" + contador);
        contador++;
    }
        
        
      
            
        }
    
    public void Login (){
        int contrasena = 123;
        int contrasenaIng;
        
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("ingrese la contraseña: ");
            contrasenaIng = scanner.nextInt();
            
            
        }while(contrasena !=contrasenaIng);
            
        
        }
            
           
        
    }    
        
        
    
    
    
    
    
    

