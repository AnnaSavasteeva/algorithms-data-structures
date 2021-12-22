package hw_anna.lesson3;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16};
        int[] arr2 = {1, 2, 4, 5, 6};
        int[] arr3 = {};
        System.out.println(getMissingNumber(arr1));
        System.out.println(getMissingNumber(arr2));
        System.out.println(getMissingNumber(arr3));
    }

    private static int getMissingNumber(int[] arr) {
        if (arr.length == 0) return 1;

        int expected = 0;
        int actual = 0;
        int lastEl = arr[arr.length - 1];
        for (int i = 1; i <= lastEl; i++) {
            expected += i;
        }
        for (int j : arr) {
            actual += j;
        }

        return expected - actual;
    }
}
