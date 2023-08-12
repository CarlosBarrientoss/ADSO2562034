
package matrices;

import java.util.Random;
import java.util.Scanner;

public class matriz2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        
        System.out.print("Ingrese el número de columnas: ");
        int numColumns = input.nextInt();

       
        int[][] matriz = new int[5][numColumns];

     
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < numColumns; j++) {
                matriz[i][j] = random.nextInt(11); 
            }
        }

   
        System.out.println("Matriz generada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < numColumns; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
