package estructuradecontrol;

import java.util.Scanner;

public class Condicional {
    
    public void condicionIf() {
        
        var num1 = 10;
        var num2 = 20;
        var num3 = 30;
     
        if (num1 < num2){
            System.out.println("num1 es menor :");
        }else if (num2 > num3){
            System.out.println("num2 es mayor :");
        }else{
            System.out.println("num3 es mayor");
        }  
}  
    
    public void comparar(){
        var numero = 4;
        var numeroTexto="Numero desconocido";
        
        if (numero == 1){
            numeroTexto = "Numero uno";
        }
        else if(numero == 2){
            numeroTexto = "Numero dos";
        }
        else if(numero == 3){
            numeroTexto = "Numero tres";
        }
        else if(numero == 4){
            numeroTexto = "Numero cuatro";
        }
        else{
            System.out.println("Numero no encontrado");
        }
}
    
        public void estacionesDelaño(){
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
        
        public void casoSwitch(){
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
        
        public void estacionSwitch(){
            Scanner caso = new Scanner (System.in);
            System.out.println("Escribe un numero del 1 al 12");
            int mes = caso.nextInt();
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
        System.out.println("Estacion");
        }
        
        public void switchFruta(){
            Scanner frut = new Scanner(System.in);
            System.out.println("Escribe tu fruta favorita");
            String fruta = frut.nextLine();
            String frutasistema = "Valor desconocido";
            
        switch (fruta){
            case "mango":
                frutasistema = "Tu fruta favorita es el mango";
                break;
            case "fresa":
                frutasistema = "tu fruta favorita es el fresa";
                break;
            case "banana":
                frutasistema = "tu fruta favorita es el banana";
                break;
            case "piña":
                frutasistema = "tu fruta favorita es el piña";
                break;
            default:
                frutasistema = "Fruta no encontrada";
        }
        System.out.println(frutasistema);
        }
        
}
        

