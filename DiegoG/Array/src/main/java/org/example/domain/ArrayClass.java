package org.example.domain;

public class ArrayClass {

    int[] number = new int[8];
    int[] numbers = {1,2,3,4,5,6,7};

    boolean found = false;
    public void arrayList(){

        for (int j : numbers) {
            System.out.println("The number on the list is: " + j);
        }

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == 5){
                System.out.println("Number " + numbers[i] + " was found on position " + i + ".");
            }
        }

        number[0] = 35;
        number[1] = 1;
        number[2] = 35;
        number[3] = 1;
        number[4] = 35;
        number[5] = 1;
        number[6] = 35;
        number[7] = 1;

        System.out.println(number[7]);

        }
        public void askedNumber(int askValue){
            for (int i = 0; i < numbers.length; i++)
                if (numbers[i] == askValue) {
                    found = true;
                }else {
                    System.out.println("The number " + askValue + " wasn't found in the Array.");
                }
            if(found = true){
        }

}