
package estructuradecontrol;


public class Condicionales {
    static int numero;
    static int mes;
    int numeroswitch;
    int numerofruta;
            
     public void condicionIF (){
        // boolean condicion = true;
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        if(num1 < num2){
            System.out.println("num1 es menor:"+ num1);
            
        }
        else if(num2 > num3){
            System.out.println("num2 es mayor:"+ num2);
        }
     
        else {
             System.out.println("el num3 es mayor:" + num3);
         }

    }
     
     public void condicionalelseif(){
           
         String numeroTexto = "Numero desconocido";
         if (numero ==1){
             numeroTexto = "Numero uno";
         }
         else if(numero ==2){
             numeroTexto = "numero dos";
         }  
         else if(numero ==3){
             numeroTexto = "numero tres";
         }  
         else if(numero ==4){
             numeroTexto = "numero cuatro";
         }
         else {
             System.out.println("Numero no encontrado");
    
         }  
     }
     
     public void estaciones (){
         int mes =4;
         String estacion = "Estacion desconocidad";
         
         if(mes ==1 || mes ==2 || mes ==12){
             estacion = "invierno";
             }
         else if(mes == 3 || mes == 4 || mes == 5){
             estacion = "Primavera";
             
             
         }
         else if (mes == 6 || mes == 7 || mes ==8){
             estacion = "Verano";
             
         }
         else if(mes == 9 || mes == 10 || mes ==11){
             estacion = "Otonio";
             
         }
         System.out.println("estacion = " + estacion);
     }
  
     public void condicionalesSwitch(){
         int numero = 5;
         String numeroTexto = "Valor desconocido";
        switch(numero){
            case 1:
                numeroTexto ="Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto ="Numero cuatro";
            default:
                numeroTexto = " Caso no encontrado";
                
                        
        }
         System.out.println("numeroTexto =" +numeroTexto);
     }
     
     public void SwitchFruta(){
         int numeroFruta = 4;
         String fruta   = "Fruta desconocida";
         switch (numeroFruta){
            case 1:
                 fruta = "manzana";
                 System.out.println("su fruta es: "+ fruta );
            case 2:
                fruta = "´pera";
                System.out.println("su fruta es: " + fruta);
            case 3:
                fruta = "uva";
                System.out.println("su fruta es: "+ fruta);
            case 4:
                fruta = "banano";
                System.out.println("su fruta es: " + fruta);
            default:
                fruta = " fruta no encontrada";
                
                
         }
                System.out.println("fruta = "+ fruta); 
                 
     }

     public void  metodowhile(){
         int contador = 0;
         while (contador < 3){
             System.out.println("Contador = "+ contador);
         contador++;
         }
          }
         public void login(){
             int contador = 0;
             int login;
             do {
                 System.out.println("ingresa la clave");
                 contador++;
                }
             while(contador<3);
     }

}
