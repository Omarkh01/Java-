package com.Omarkhh;

import java.util.Scanner;

public class FriendlyPair {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int sum1 = 0 , sum2 = 0;
        int i, k = 0;

        for (i = 1; i <= number1; i++){

            if (number1 % i == 0)
                sum1 += i;
        }

        k = 0;

        for (i = 0; i <= number2; i++){

            if (number2 % 1 == 0)
                sum2 += i;
        }


        if (sum1 == sum2)
            System.out.println("Friendly Pair!");
        else
            System.out.println("Not friendly pair!");

    }
}
