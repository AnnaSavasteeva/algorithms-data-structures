package hw_anna.lesson3;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16};
        int[] arr2 = {1, 2, 4, 5, 6};
        int[] arr3 = {};

        System.out.println("--- Хорошая реализация ---");
        System.out.println(getMissingNumberPerfectWay(arr1));
        System.out.println(getMissingNumberPerfectWay(arr2));
        System.out.println(getMissingNumberPerfectWay(arr3));

        System.out.println("--- Плохя реализация ---");
        System.out.println(getMissingNumberBadWay(arr1));
        System.out.println(getMissingNumberBadWay(arr2));
        System.out.println(getMissingNumberBadWay(arr3));
    }

//    Хороший способ со сложностью O(logN)
    private static int getMissingNumberPerfectWay(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int base = (start + end) / 2;
            if (arr[base] - base == 1) {
                start = base + 1;
            } else {
                end = base - 1;
            }
        }
        return start + 1;
    }

//    Плохой способ, т.к. сложность алгоритма - линейная (O(n)).
//    Это из-за того, что приходится все равно обходить все элементы,
//    чтобы посчитать сумму их значений
    private static int getMissingNumberBadWay(int[] arr) {
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
