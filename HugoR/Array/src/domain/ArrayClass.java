package domain;

import java.util.Scanner;

public class ArrayClass {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        boolean founds = false;
        int position = 0;
        System.out.println("Into the Number to search");
        int valueSearch = imput.nextInt();
        //declaro un arreglo
        //int[] number = new int[8]
        //int number[] = new int[8];

       // number[0] = 35;
        //number[1] = 32;
        //number[2] = 56;
       // number[3] = 80;
       // number[4] = 55;
        //number[5] = 75;
        //number[6] = 19;
        //number[7] = 27;
        //System.out.println("Array: " + number[7]);

        //llenarlo de una de otra forma y como le doy valores

        int numbers[] = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < numbers.length; i++){
            //System.out.println("Numbers: " + numbers[i]);
            //puede tambien pedir por pantalla el numero que se va a buscar

            int find = numbers[i];
            if(find == valueSearch ){
                //founds = true; //validar
                System.out.println("Numbers: " + numbers[i]+ " found in array position " + i );
            }else if (find == valueSearch){
                if(find == numbers.length){
                    System.out.println("Number: " + valueSearch+ " Not found in array ");
                }
            }

        }






    }




}
