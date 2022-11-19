package h2;

import java.util.Scanner;

public class h2 {
    public static void main(String[] args) {
        // Task 1
        try {
            System.out.println(" Enter a fractional number:");
            System.out.println("You entered --> " + FractionNumber());
        } catch (Exception e) {
            System.out.println("Your input is incorrect!\nPlease try again:");
            System.out.println("You entered --> " + FractionNumber());
        }

        // Task 2
            try {
            int[] intArray = new int [10];
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

        // Task 3
        
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            // printSum(23, null); // NullPointerException
            int[] abc = {1,2};
            abc[1] = 9;
            //abc[3] = 9; // IndexOutOfBoundsException
            } 
            catch (IndexOutOfBoundsException ex) {
                System.out.println("Array goes beyond its size!");
            } 
            catch (NullPointerException ex) { 
                System.out.println("Pointer cannot point to null!");
            } 
            catch (Throwable ex) { // we bring it to the end, since other exceptions will not be processed
                System.out.println("something went wrong...");
            }

        // Task 4
            enterString();
             
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }


    // Task 1
    // Implement a method that prompts the user to enter a fractional number (float type) and returns the entered value.
    // Entering text instead of a number should not lead to the fall of the application, instead, you must re-request from
    // User data entry.

    public static float FractionNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();
    }

    // Task 4
    // Develop a program that will discard Exception when the user enters an empty line.
    // A message should appear to the user that empty lines cannot be entered.

    public static String enterString() {
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in); 
        String res = sc.nextLine();
        if (res.isEmpty()) {
            throw new RuntimeException("You cannot enter an empty string.");
        }  
        return res;   
    } 

}   

