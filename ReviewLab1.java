/*
 *  Assignment [Review Lab 1]
 *  Description: [This program takes the user's desired height of a triangle and proceeds to print out rows of stars
 *  that gradually make a shape of a triangle and increment by 1 star with each row. With each row added, the triangle
 *  starts to become more prominent and taller as well.]
 *  Name: [Anna Hernandez]
 *  ID: [921045993]
 *  Class: CSC 211-06
 *  Semester: Fall 2020
 */
import java.util.Scanner;
public class ReviewLab1 {

    public static void printTriangles(int height){
        for(int i = 0; i < height; i++){
            for(int j = height-i; j>1; j--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the desired height for the triangle: ");
        int height = sc.nextInt();
        printTriangles(height);


    }
}
