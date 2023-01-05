package com.PrimeNumber;

public class ChallangeOne {
    public static void main(String[] args) {
        int number = 0;
        int moreNumber = 0;
        for(int i= 1; i<=1000; i++) {
            if((i % 3 == 0)&&(i % 5 == 0)){
                number++;
                moreNumber += i;
                System.out.println("The Numbers that can divided by both 3 and 5: " + i);
            }
            if(number == 5) {
                break;
            }
        }

        System.out.println("Sum = " + moreNumber);

    }
}
