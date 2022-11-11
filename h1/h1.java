package h1;

public class h1 {
    public static void main(String[] args) {
        System.out.println(divide(10, 0));
        System.out.println(getArrayElement(new int[10]));
        System.out.println(getArrayLen(new int[-1]));

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


}
