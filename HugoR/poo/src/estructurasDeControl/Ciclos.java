package estructurasDeControl;

import java.util.Scanner;

public class Ciclos {

    public void cicloWhile(){

        var contador = 0;

        while(contador < 3){
            System.out.println("Contador = " + contador);
            contador++;
        }
    }

    public void login(){
        var palabraSecreta = "Hugo";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu contraceña");
        var entrada = scanner.nextLine();

        do{
            System.out.println("Contraceña Incorrecta");
            System.out.println("Ingresa tu contraceña");
            entrada = scanner.nextLine();
        }while(!entrada.equals(palabraSecreta));
        System.out.println("YA");
    }

}
