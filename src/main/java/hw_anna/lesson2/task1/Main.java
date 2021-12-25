package hw_anna.lesson2.task1;

import java.util.Arrays;
import java.util.Random;

public class Main {

    private static final int ARR_SIZE = 5000;

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
            notebooks[i] = createNotebook();
        }
    }

    private static Notebook createNotebook() {
        Random random =new Random();
        int price = random.nextInt(26) * 100 + 500;
        int ram = random.nextInt(4, 21) + 4;
        int producersCount = Producer.values().length;
        Producer producer = Producer.values()[random.nextInt(producersCount)];
        return new Notebook(price, ram, producer);
    }
}
