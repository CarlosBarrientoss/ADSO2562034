package domain;

public class ArrayClass {

    public static void main(String[] args) {
        int[] number = new int[8];
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        

        number[0] = 35;
        number[1] = 32;
        number[2] = 8;
        number[3] = 77;
        number[4] = 88;
        number[5] = 5;
        number[6] = 11;
        number[7] = 97;

        System.out.println("array: " + number[7]);
        
        for (int i = 0; i <= numbers.length; i++) {
            System.out.println("numbers" + numbers[i]);
        }
    }
}
