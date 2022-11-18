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
