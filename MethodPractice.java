/*
 *  Assignment [Chapter 6 Lab]
 *  Description: [This program returns a variety of methods. One of the methods is a shortcut for printing out
 * "Hello World!". Another adds two integers together, one of them prints out the sum of two integers, another method
 * determines whether or not a number is even, and the last method uses the linear function y = mx+b to figure out what
 *  y equals given the values of the slope, x, and the y-intercept.]
 *  Name: [Anna Hernandez]
 *  ID: [921045993]
 *  Class: CSC 211-06
 *  Semester: Fall 2020
 */
public class MethodPractice {
    public static void main(String[] args) {
        printHelloWorld();
        printHelloWorld();
        printHelloWorld();
        printInteger(5);
        int a = addIntegers(5,4);
        int b = addIntegers(12, 6);
        int c = addIntegers(a, b);
        System.out.println(c);
        printAddIntegers(10, 20);
        printAddIntegers(25, 4);
        System.out.println(isEven(4));
        System.out.println(isEven(11));
        System.out.println(isEven(addIntegers(5,5)));
        System.out.println(linearFunction(5.0, 2.5,0.0));
        System.out.println(linearFunction(1.0,2.0,3.0));
        System.out.println(linearFunction(15, 200, 5));
    }

public static void printHelloWorld(){
    System.out.println("Hello World! ");
        }


public static void printInteger(int x) {
    for (int i = 0; i < 10; i++) {
        System.out.print(x + " ");
    }
    System.out.print("\n");
}

public static int addIntegers(int x, int y){
        return x+y;
}

public static void printAddIntegers(int a, int b){
        int sum = a+b;
        printInteger(sum);
}

public static boolean isEven(int x){
    return x % 2 == 0;
}

public static double linearFunction(double x, double slope, double yIntercept){
        return (slope*x + yIntercept);
}

}