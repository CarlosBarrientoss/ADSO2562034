package ejerciciosam;

import java.util.Scanner;

public class Aray1 {

    public static void main(String[] args) {
        int[] num = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite un numero ");
        // darle valores al array
        for (int i = 0; i < 5; i++) {
            System.out.println("valor " + (i + 1) + " :");
            num[i] = sc.nextInt();

        }
        System.out.println("Array con todos los valores ");
        for (int i = 0; i < num.length; i++) {
            System.out.println("valor " + (i + 1) + ":" + num[i]);
        }
        
        

        Scanner positionDelete = new Scanner(System.in);
        System.out.println("Digite la posicion que deses eliminar");
        int position = positionDelete.nextInt();
        int[] newArray = new int[num.length - 1];

        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i != position) {

                newArray[j++] = num[i];

            }

        }

        //nuevo arreglo 
        System.out.println("array con posicion eliminada ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("valor " + (i + 1) + ":" + newArray[i]);

        }
        
     
        
    }

}
