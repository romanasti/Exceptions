package h1;

import java.util.Arrays;

public class h1 {
    public static void main(String[] args) {
        System.out.println(divide(10, 0));
        System.out.println(getArrayElement(new int[10]));
        System.out.println(getArrayLen(new int[-1]));

        System.out.println(Arrays.toString(differenceArrays(
                new int[] { 1, 2, 3, 4, 5 },
                new int[] { -1, -2, -3, -4, -5 })));
            // new int[] { -1, -2, -3, -4, -5, -6 }))); RuntimeException: Arrays are not equal
        System.out.println(Arrays.toString(quotientArrays(
            new int[] { 1, 2, 3, 4, 5 },
            new int[] { -1, -2, -3, -4, -5 })));
            // new int[] { -1, -2, -3, -4, -5, -6 }))); RuntimeException: Arrays are not equal
            // new int[] { 0, -2, -3, -4, -5 }))); RuntimeException: You cannot divide by zero

    }

    // Task 1
    // Implement 3 methods to get different exceptions in each of them

    public static int getArrayLen(int[] array) {
        return array.length;
    }

    public static int divide(int n1, int n2) {
        return n1 / n2;
    }

    public static int getArrayElement(int[] array) {
        return array[100];
    }

    // Task 3
    // Implement a method that takes two integer arrays as arguments
    // and returns a new array with each element equal to the element difference of
    // the two incoming arrays in the same cell.
    // If the array lengths are not equal, you must notify the user somehow.

    public static int[] differenceArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Arrays are not equal");
        }
        int[] result = new int[array1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array1[i] - array2[i];
        }
        return result;
    }

    // Task 4
    // Implement a method that takes two integer arrays as arguments and returns a
    // new array, each element of which is equal to the partial elements of two
    // incoming arrays in the same cell. If the array lengths are not equal, you
    // must notify the user somehow. Important: When executing the method, the only
    // exception that the user can see is RuntimeException, that is yours.

    public static int[] quotientArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Arrays are not equal");
        }
        int[] result = new int[array1.length];
        for (int i = 0; i < result.length; i++) {
            if (array2[i] == 0) {
                throw new RuntimeException("You cannot divide by zero");
             }
            result[i] = array1[i] / array2[i];
        }
        return result;
    }


}
