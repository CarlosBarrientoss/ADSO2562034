package ejerciciosam;

import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        int[] num = new int[20];
        int[] newArray = fillArray(num);
        showArray(newArray);

    }

    private static int[] fillArray(int[] array) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa un valor ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("valor " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        return array;

    }

    private static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("valor " + array[i] + " en la posision " + i);

        }

    }

}
