/*
 * [Author]: Anna Hernandez
 * [Class]: CSC 210-02
 * [Description]: This program takes a string provided by the user and converts the string into a whole new string, if
 * it meets the proper requirements. It multiplies all integers in the String by two and returns the product. If the
 * product is greater than or equal to 10, then it returns the sum of the product. For example, if the product was 10,
 * it returns 1 + 0, which is 1. It also converts all lowercase letters in the string to upper case and all uppercase
 * letters to lowercase. Any other characters it leaves alone and returns them as is.
 */

import java.util.Scanner;
public class p2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter [q] or [Q] to terminate the program");

        while(true){
            System.out.print("Original string (input): ");
            String userInput = sc.nextLine();
            StringBuilder newStr=new StringBuilder(userInput);
            //https://www.javatpoint.com/java-program-to-replace-lower-case-characters-with-upper-case-and-vice-versa

            if(userInput.equals("q") || userInput.equals("Q")) {
                System.out.println("Terminating upon user's request! ");
                break;
            }

        for(int i =0; i < userInput.length(); i++) {

            if (Character.isUpperCase(userInput.charAt((i)))) {
                newStr.setCharAt(i, Character.toLowerCase(userInput.charAt(i)));

            }
            if (Character.isLowerCase(userInput.charAt(i))) {
                newStr.setCharAt(i, Character.toUpperCase(userInput.charAt(i)));

            }
            if (Character.isDigit(userInput.charAt(i))) {
                int n = Character.getNumericValue(userInput.charAt(i));
                int product = n * 2;
                if(product >= 10){
                   product = getSum(product);
                }
                char c = (char) (product + '0');
                //https://www.javatpoint.com/java-int-to-char
                newStr.setCharAt(i, c);
            }

        }
            System.out.println("Converted String (output): " + newStr);
        }

    }
    public static int getSum(int n){
        int sum = 0;
        while(n != 0){
            sum = sum + n % 10;
            n = n/10;
        }
        return sum;
//https://www.geeksforgeeks.org/java-program-for-sum-the-digits-of-a-given-number/
    }
}
