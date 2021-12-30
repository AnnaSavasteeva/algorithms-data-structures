package lesson2;

import lesson2.sort.*;

public class Main {

    public static void main(String[] args) {
        MyArray.isRepeat = false;
        MyArray.isShuffle = true;
        final int SIZE = 50000;
        Integer[] arr = MyArray.getArray(SIZE, 5);

//        System.out.println(Arrays.toString(arr));

        SpeedTest.startTime();

        //sort
//        BubbleSort.sort(arr); //при 50000 - 12238ms
//        CocktailSort.sort(arr); //14013ms
//        SelectionSort.sort(arr); //2500ms
//        InsertionSort.sort(arr); //2100ms
//        Arrays.sort(arr); //29ms
//        CombSort.sort(arr); //42ms
//        PigeonholeSort.sort(arr); //10ms
        QuickSort.sort(arr); //123

        SpeedTest.endTime();

//        System.out.println(Arrays.toString(arr));

/*        System.out.println(BinarySearch.search(arr, 500000));
        System.out.println(InterpolationSearch.search(arr, 500000));
        System.out.println(ExponentialSearch.search(arr, 500000));*/
    }
}
