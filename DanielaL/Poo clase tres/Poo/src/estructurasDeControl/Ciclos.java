package estructurasDeControl;

import java.util.Scanner;

public class Ciclos {
    public void cicloWhile(){
        var contador = 0;
        while (contador < 3){
            System.out.println("contador = " + contador);
            contador++;
        }
    }
    public void login(){
        var palabraSecreta = "Dorothy";
        var passUser = "";

        Scanner pass = new Scanner(System.in);

        do {
            System.out.println("Escribe tu contraseña: ");
            passUser = pass.nextLine();
        }while (!palabraSecreta.equals(passUser));
        System.out.println("Contraseña correcta bienvenido");
    }
}
