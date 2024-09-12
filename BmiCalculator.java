/*
 *  Assignment [Chapter 2 Lab]
 *  Description: [This program takes the user's height (m) and weight (kg)
 *  and then calculates the user's BMI in kg/m2 by using the formula
 *  weight / (height*height)]
 *  Name: [Anna Hernandez]
 *  ID: [921045993]
 *  Class: CSC 211-06
 *  Semester: Fall 2020
 */
import java.util.Scanner;
public class BmiCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Declaring variables and data type
        double height;
        int weight;
        //Printing out what the code is for
        System.out.println("Welcome to my BMI calculator ");

        //Getting user's weight in kg
        System.out.println("Input your weight in kilogram: ");
        weight = sc.nextInt();

        //Getting user's height in m
        System.out.print("Input your height in meters: ");
        height = sc.nextDouble();

        //Printing out user's weight and height
        System.out.println("Your weight is : " + weight + "kg");
        System.out.println("Your height is : " + height + "m");

        //Printing out user's BMI
        double BMI = weight / (height*height);
        System.out.println("Your BMI is : " + BMI + " kg/m2");

    }
}
