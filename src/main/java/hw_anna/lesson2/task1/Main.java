package hw_anna.lesson2.task1;

import java.util.Arrays;
import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();
    private static final int ARR_SIZE = 5;
    private static final String[] BRANDS = {"Lenuvo", "Asos", "MacNote", "Eser", "Xamiou"};

    public static void main(String[] args) {
        Notebook[] notebooks = new Notebook[ARR_SIZE];
        fillArr(notebooks);
        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }
        System.out.println("------");
        Arrays.sort(notebooks, Notebook.NotebooksComparator);
        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }
    }

    private static void fillArr(Notebook[] notebooks) {
        for (int i = 0; i < notebooks.length; i++) {
            int price = RANDOM.nextInt(450, 1951) + 50;
            int ram = RANDOM.nextInt(4, 21) + 4;
            int brandIndex = RANDOM.nextInt(BRANDS.length);
            notebooks[i] = new Notebook(price, ram, BRANDS[brandIndex]);
        }
    }
}
