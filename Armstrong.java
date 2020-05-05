package com.Omarkhh;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = scanner.nextInt();

        String n_str = String.valueOf(n);
        int last_digit = n_str.charAt(n_str.length() - 1);
        int i, k;
        int sum = 0;

        for (i = 0; i < n_str.length(); i++){
            k = n_str.charAt(i);
            sum += Math.pow(last_digit , k);
        }

        if (n == sum)
            System.out.println("Armstrong!");
        else
            System.out.println("Not armstrong!");



    }

}
