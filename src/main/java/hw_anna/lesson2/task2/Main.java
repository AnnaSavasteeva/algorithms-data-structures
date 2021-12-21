package hw_anna.lesson2.task2;

import lesson2.MyArray;
import lesson2.SpeedTest;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyArray.isRepeat = false;
        MyArray.isShuffle = true;
        final int SIZE = 10;
        Integer[] arr = MyArray.getArray(SIZE, 5);

        if (arr.length <= 10) System.out.println(Arrays.toString(arr));
        SpeedTest.startTime();

        SelectionSort.sort(arr);

        SpeedTest.endTime();
        if (arr.length <= 10) System.out.println(Arrays.toString(arr));
    }
}
