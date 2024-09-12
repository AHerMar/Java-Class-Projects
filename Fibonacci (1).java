/*
 *  Assignment [Chapter 5 Lab]
 *  Description: [This program takes the user's number input to calculate
 *  the series of terms in the Fibonacci sequence. The Fibonacci sequence just adds
 *  the previous number to the next number, starting from 0 and 1.
 *  In this program, the Fibonacci series ranges from 0 to 20.
 *  So if the user inputs 3, it will print out 0 1 1. ]
 *  Name: [Anna Hernandez]
 *  ID: [921045993]
 *  Class: CSC 211-06
 *  Semester: Fall 2020
 */



import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        int num3;

        System.out.println("Enter number of terms for Fibonacci series:");
        int count = sc.nextInt();

        if (count > 20 || count < 0 || count == -0) {
            System.out.println("Please enter a number less than 20");
        } else {
            System.out.print(num1 + " " + num2);
            for (int i = 2; i < count; i++) {
                num3 = num1 + num2;
                System.out.print(" " + num3);
                num1 = num2;
                num2 = num3;
            }
        }
    }
}

