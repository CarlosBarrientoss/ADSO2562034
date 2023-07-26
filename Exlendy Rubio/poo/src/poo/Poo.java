package poo;
//variable local

import java.util.Scanner;

public class Poo{
    
    public static void main(String[] args) {
       
      Scanner pedir = new Scanner(System.in);
      Operadores intancioaOperacion = new Operadores();
      
      System.out.print("digite numero: ");
      intancioaOperacion.a = pedir.nextInt();
      System.out.print("digite numero 2: ");
      intancioaOperacion.b =pedir.nextInt();
      
      
      intancioaOperacion.sumar();
      
      intancioaOperacion.multiplicartwo();
      
      intancioaOperacion.division();
      
      intancioaOperacion.resta();
      
      intancioaOperacion.operadorIgualdadstring();
      
      intancioaOperacion.preincremento();
      
      intancioaOperacion.operadorTernario();
      
      
      
     
      //System.out.print(intancioaOperacion.multiplicar(12,16));
    }
    
}
