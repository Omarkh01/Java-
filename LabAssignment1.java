package com.Omarkhh;

import java.util.Scanner;

public class LabAssignment1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        sum(num1 , num2);
        scanner();
        greatestInt(num1 ,num2, num3);
        squares();
    }
    //Q1
    private static void sum(int a ,int b){
        System.out.println("Q1:");
        System.out.println(a+b);
        System.out.println();
    }
    //Q2
    private static void scanner(){
        System.out.println("Q2:\n"+"Hello World\n"+"Java Programming is easy.\n");
    }
    private static void greatestInt(int a,int b, int c){
        System.out.println("Q3:");
        if (a>=b && a>=c)
            System.out.printf("%d\n",a);
        else if(b>=a && b>=c)
            System.out.printf("%d\n",b);
        else
            System.out.printf("%d\n",c);
        System.out.println();
    }
    private static void squares(){
        System.out.println("Q4:");
        for (int i=1; i<6; i++)
            System.out.printf("%d\t",i*i);
    }

}
