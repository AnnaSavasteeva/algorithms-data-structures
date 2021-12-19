package lesson2.sort;

public class SelectionSort {
    public static void sort(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indexForMin = i;
            int indexForMax = arr.length - 1 - i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexForMin]) {
                    indexForMin = j;
                }
                if (arr[arr.length - 1 - j] > arr[indexForMax]) {
                    indexForMax = arr.length - 1 - j;
                }
            }

            int tempMin = arr[i];
            arr[i] = arr[indexForMin];
            arr[indexForMin] = tempMin;

            int tempMax = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[indexForMax];
            arr[indexForMax] = tempMax;
        }
    }
}
