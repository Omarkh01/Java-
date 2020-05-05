package com.Omarkhh;

import java.util.Scanner;

public class Handshakes {

     public static void main(String args[]){

         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter number of students: ");
         int n = scanner.nextInt();
         int sum = 0, i = 0;

         while (i < n){

             sum += i;
             i++;

         }

         System.out.println("Maximum possible handshakes: " + sum);
     }
}
