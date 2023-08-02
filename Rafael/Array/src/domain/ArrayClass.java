package domain;

import java.util.Scanner;

public class ArrayClass {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        boolean founds = false;
        int number[] = new int[8];
        System.out.print("Ingresa el valor: ");
        int valueSearch = imput.nextInt();
        number[0] = 35;
        number[1] = 32;
        number[2] = 3;
        number[4] = 22;
        number[5] = 11;
        number[6] = 6;
        number[7] = 47;
        System.out.println("array = " + number[7]);

        int numbers[] = {1,2,3,4,5,35};

        for (int i = 0; i < numbers.length; i++){
            int find = numbers[i];
            if(find  ==valueSearch){
                System.out.println("posicion: " + i + " numero = " + find);
            }else{
                if (find == numbers.length)
                    System.out.println("numero no encontrado");
            }
        }

    }
}
