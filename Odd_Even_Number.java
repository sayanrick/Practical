package com.java;

import java.util.Scanner;

public class Odd_Even_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("The number " + n + " is an even number.");
        } else {
            System.out.println("The number " + n + " is an odd number");
        }
    }
}
