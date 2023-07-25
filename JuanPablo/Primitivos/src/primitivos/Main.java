package primitivos;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite un numero: ");
        int numero1 = scanner.nextInt();
        
        System.out.println("Digite otro numero: ");
        int numero2 = scanner.nextInt();
        
        int suma = numero1 + numero2;
        System.out.println("Suma: " + suma);
    }
}
