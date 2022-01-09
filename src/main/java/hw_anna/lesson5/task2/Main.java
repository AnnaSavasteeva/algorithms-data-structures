package hw_anna.lesson5.task2;

import java.util.*;

public class Main {

    private final static int MIN_WEIGHT = 1;
    private final static int MAX_WEIGHT = 5;
    private final static int MIN_COST = 100;
    private final static int MAX_COST = 5000;
    private final static int TOTAL_ITEMS_AMOUNT = 10;

    public static void main(String[] args) {
        Backpack backpack = new Backpack(MAX_WEIGHT);
        List<Item> items = new LinkedList<>();
        List<Item> bestItemsList;

        fillList(items);
        if (items.size() <= 10) {
            System.out.println("----- ALL ITEMS -----");
            for (Item item : items) {
                System.out.println(item);
            }
        }

        backpack.setBestItemsList(items);
        bestItemsList = backpack.getBestItemsList();
        System.out.println("----- BEST ITEM SET -----");
        for (Item item : bestItemsList) {
            System.out.println(item);
        }
    }

    private static void fillList(List<Item> items) {
        Random random = new Random();
        for (int i = 0; i < TOTAL_ITEMS_AMOUNT; i++) {
            int weight = random.nextInt(MAX_WEIGHT) + MIN_WEIGHT;
            int cost = random.nextInt(MAX_COST) + MIN_COST;
            items.add(new Item(weight, cost));
        }
    }
}
