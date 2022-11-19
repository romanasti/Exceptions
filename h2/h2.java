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
                System.out.println("Массив выходит за пределы своего размера!");
            } 
            catch (NullPointerException ex) { 
                System.out.println("Указатель не может указывать на null!");
            } 
            catch (Throwable ex) { // выносим в конец, так как другие исключения не будут обработаны
                System.out.println("Что-то пошло не так...");
            }
             
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }


    // Task 1
    // Implement a method that prompts the user to enter a fractional number (float type) and returns the entered value.
    // Entering text instead of a number should not lead to the fall of the application, instead, you must re-request from
    // User data entry.

    public static float FractionNumber() {
        Scanner x = new Scanner(System.in);
        return x.nextFloat();
    }

}   

