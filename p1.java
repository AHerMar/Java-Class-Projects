/*
 * [Author]: Anna Hernandez
 * [Class]: CSC 210-02
 * [Description]: This program takes two numbers provided by the user and measures the distance between them. It then
 * takes the user's stream of inputs and measures the distance between each input. If the distance between one of the
 * user's inputs is greater than the initial distance, the program stops taking in more inputs and terminates, telling
 * the user how many inputs it accepted.
 */




import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 2;

        System.out.print("Please enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Please enter the second number: ");
        int num2 = sc.nextInt();
        int distance = num2 - num1;

        System.out.println("Please stream your inputs: ");

        while(sc.hasNextInt()){
            int n1 = sc.nextInt();
            counter +=1;
           int n2 = sc.nextInt();
            counter +=1;
            int distance2 = n2 - n1;


            if(Math.abs(distance2) != Math.abs(distance) && Math.abs(distance2) > Math.abs(distance)){
                counter -=1;
                System.out.println("Terminating the program!");
                System.out.println("The distance between last two inputs is more than the initial distance! ");
                System.out.println("The program ran for " + counter + " inputs, including the first two!");
                break;

            }
        }
    }
}


