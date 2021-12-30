package lesson2.search;

public class BinarySearch {

    public static int search(Integer[] arr, int num2Find) {
        int start = 0;
        int end = arr.length - 1;
        int base;
        int i = 0;


        while (end >= start) {
            i++;
            base = (start + end) / 2;
            System.out.println("Base: " + base);

            if (arr[base] == num2Find) {
                System.out.println("Кол-во итераций: " + i);
                return base;
            } else if (arr[base] < num2Find) {
                start = base + 1;
            } else {
                end = base - 1;
            }
        }

        System.out.println("Кол-во итераций: " + i);
        return -1;
    }


    public static int searchRec(Integer[] arr, Integer num) {
        return searchRec(arr, num, 0, arr.length);
    }

    public static int searchRec(Integer[] arr, Integer num, int start, int end) {
        if (end < start) {
            return -1;
        }

        int base = (start + end) / 2;
        if (arr[base].equals(num)) {
            return base;
        } else if (num.compareTo(arr[base]) > 0) {
            return searchRec(arr, num, base + 1, end);
        }
        return searchRec(arr, num, start, base - 1);
    }
}
