package estructurasDeControl;

import java.util.Scanner;

public class Ciclos {

    public void cicloWhile(){

        var contador = 0;

        while (contador <= 3){
            System.out.println("contador = " + contador);
            contador++;
        }
    }

    public void login(){

        var password = "Dani";
        var prueba = " ";
        Scanner askPassword = new Scanner(System.in);

        do{
            System.out.println("Ingresa la contraseña");
            prueba = askPassword.nextLine();

        }while (!prueba.equals(password));

        System.out.println("Contraseña Correcta");


    }
}
