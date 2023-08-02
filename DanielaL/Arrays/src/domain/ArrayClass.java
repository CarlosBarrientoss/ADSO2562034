package domain;

import java.util.Scanner;

public class ArrayClass {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        String number[] = new String[8];

        number[0]="K";
        number[1]="a";
        number[2]="r";
        number[3]="e";
        number[4]="n";
        number[5]=" ";
        number[6]="L";
        number[7]="C";

        /*for (int i = 0;i < number.length;i++) {
            System.out.print(number[i]);
        }

        System.out.println();*/

        System.out.println("Into the value to search: ");
        int valueSearch =imput.nextInt();

        int numbers[]={1,2,3,4,5,6};
        for (int i = 0;i <= numbers.length;i++) {
            if (numbers[i]==valueSearch){
                System.out.println("Number "+numbers[i]+" Found in array position: "+i);
            }if (numbers[i]!=valueSearch){
                System.out.println("Number: "+valueSearch+" not found in array");
            }
        }
    }
}