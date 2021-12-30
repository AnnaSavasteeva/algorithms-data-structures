package lesson2.search;

import java.util.Arrays;
import java.util.Objects;

public class ExponentialSearch {

    public static int search(Integer[] arr, Integer num) {
        if (Objects.equals(arr[0], num)) {
            return 0;
        }
        if (Objects.equals(arr[arr.length - 1], num)) {
            return arr.length - 1;
        }

        int range = 1;
        int i = 0;

        while (range < arr.length && arr[range] <= num) {
            range *= 2;
            i++;
        }

        System.out.println("Экспоненциальный поиск: " + i);

        return BinarySearch.searchRec(arr, num, range / 2 + 1, Math.min(range - 1, arr.length - 1));
    }
}
