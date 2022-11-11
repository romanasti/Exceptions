package h1;

import java.util.Arrays;

public class h1 {
    public static void main(String[] args) {
        System.out.println(divide(10, 0));
        System.out.println(getArrayElement(new int[10]));
        System.out.println(getArrayLen(new int[-1]));

        System.out.println(Arrays.toString(returnNewArray(
                new int[] { 1, 2, 3, 4, 5 },
                new int[] { -1, -2, -3, -4, -5})));
                // new int[] { -1, -2, -3, -4, -5, -6 })));  RuntimeException: Arrays are not equal
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

    public static int[] returnNewArray(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Arrays are not equal");
        }
        int[] result = new int[array1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array1[i] - array2[i];
        }
        return result;
    }

}
