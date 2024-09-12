/*
 *  Assignment [Lab 5]
 *  Description: [This program displays the average area of three circles with different radii. It also
 * takes the user's radius of a circle to calculate the circumference.]
 *  Name: [Anna Hernandez]
 *  ID: [921045993]
 *  Class: CSC 211-06
 *  Semester: Fall 2020
 */

import java.util.Scanner;

public class Circle {

    public static void main(String [] args){
        otherCircles(4, 6, 8);

        double area1 = 3.14*(4*4);
        double area2 = 3.14*(6*6);
        double area3 = 3.14*(8*8);
        System.out.println("The average area of the three radii are " + averageArea(area1, area2, area3));

    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter the radius of a circle to calculate the circumference: ");
    int r1 = sc.nextInt();
    System.out.println("The circumference of " + r1 + " is " + circumference(r1));

    }

    public static void otherCircles(int r1, int r2, int r3) {
        System.out.println("The three radii are " + r1 + ", " + r2 + ", and " + r3 + ".");
    }

    public static double averageArea(double area1, double area2, double area3){
        return(area1+ area2+ area3) / 3;
    }

    public static double circumference(int r){
        return 2*3.14*r;
    }
}
