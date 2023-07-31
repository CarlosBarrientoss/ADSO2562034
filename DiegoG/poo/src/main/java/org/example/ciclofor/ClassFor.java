package org.example.ciclofor;

public class ClassFor {

    int limit;
    int counterPair;
    int counterImpair;

    public void numbersPair(){
        for (int i = 1; i<= limit; i++ ){
            if(i % 2 == 0){
                System.out.println("The number " + i + " is pair.");
                counterPair = counterPair + 1;
            }else{
                System.out.println("The number " + i + " is  impair.");
                counterImpair = counterImpair + 1;
            }

        }
        System.out.println("The amount of pair numbers is : " + counterPair);
        System.out.println("The amount of impair numbers is : " + counterImpair);
    }
}