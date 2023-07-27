
package estructuradecontrol;
import java.util.Scanner;

        
        public class Principal {
    public static void main(String [] args){
       
        
        Scanner recibirNumero = new Scanner(System.in);
        Condicionales imprimirCondicionales= new Condicionales();
        System.out.println("Ingrese el numero");
        imprimirCondicionales.numero = recibirNumero.nextInt();
        System.out.println("Ingrese el mes");
        imprimirCondicionales.mes = recibirNumero.nextInt();

       



//intancia de la clase condicional
        imprimirCondicionales.condicionIF();
        imprimirCondicionales.condicionalelseif();
        imprimirCondicionales.estaciones();
        imprimirCondicionales.condicionalesSwitch();
        imprimirCondicionales.SwitchFruta();
        imprimirCondicionales.metodowhile();
        imprimirCondicionales.login();
    }
    
}
