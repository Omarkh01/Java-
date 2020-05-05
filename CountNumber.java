package com.Omarkhh;

import java.util.Scanner;

public class CountNumber {


    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int a = scanner.nextInt();
        int i = 10, count = 1;

        while (true){

            if(a - i < 0)
                break;

            count++;
            i = i * 10;
        }

        System.out.println("The integer " + a + " has " + count +  " digits.");

    }
}
