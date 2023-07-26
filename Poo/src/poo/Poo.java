package poo;

import java.util.Scanner;

public class Poo {
    public static void main(String[] args) {
        Operadores instanciaOperadores = new Operadores();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer número: ");
        instanciaOperadores.a = sc.nextInt();

        System.out.println("Ingresa el primer número: ");
        instanciaOperadores.b = sc.nextInt();

        instanciaOperadores.sumar();
        instanciaOperadores.resta();
        instanciaOperadores.multiplicar();
        instanciaOperadores.dividir();

        instanciaOperadores.asignacionSuma();
        instanciaOperadores.asignacionResta();
        instanciaOperadores.asignacionMultiplicar();
        instanciaOperadores.asignacionDividir();
        instanciaOperadores.asignacionModulo();

        instanciaOperadores.preIncremento();
        instanciaOperadores.preDecremento();
        instanciaOperadores.postIncremento();
        instanciaOperadores.postDecremento();

        instanciaOperadores.opIgualdadEnteros();
        instanciaOperadores.opDiferenciaEnteros();

        Scanner palabra = new Scanner(System.in);
        System.out.println("Ingresa la primer palabra: ");
        instanciaOperadores.cadenaUno = palabra.nextLine();

        System.out.println("Ingresa la segunda palabra: ");
        instanciaOperadores.cadenaDos = palabra.nextLine();

        instanciaOperadores.opIgualdadString();
        instanciaOperadores.opIgualdadEquals();
    }
}