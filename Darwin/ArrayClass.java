
package domain;


public class ArrayClass {
    public static void main(String[] args) {
        int number [] = new int [8];
        int numbers [] = {1, 2 ,3, 4, 5, 6};
        for ( int i=0; i< numbers.length; i++){
            System.out.println(" numbers: "+ numbers[i]);
        }
        
        number [0]= 35;
        number [1]= 32;
        number [2]= 32;
        number [3]= 32;
        number [4]= 32;
        number [5]= 32;
        number [6]= 32;
        number [7]= 30;
       
       
        System.out.println("array: "+ number[7]);
         
    }
    
}
