package hw_anna.lesson5.task2;

import java.util.LinkedList;
import java.util.List;

public class Backpack {

    private final int maxWeight;
    private int totalCost = 0;
    private List<Item> bestItemsList = null;

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public List<Item> getBestItemsList() {
        return bestItemsList;
    }

    public void setBestItemsList(List<Item> items) {
        if (items.size() > 0) chooseBestItemsList(items);

        for (int i = 0; i < items.size(); i++) {
            List<Item> newList = new LinkedList<>(items);
            newList.remove(i);
            setBestItemsList(newList);
        }
    }

    private void chooseBestItemsList(List<Item> items) {
        int itemsWeight = calcWeight(items);
        int itemsCost = calcCost(items);

        if (itemsWeight > maxWeight) {
            return;
        }

        if (bestItemsList == null || itemsCost > totalCost) {
            this.bestItemsList = items;
            totalCost = itemsCost;
        }
    }

    private int calcWeight(List<Item> items) {
        int totalWeight = 0;

        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    private int calcCost(List<Item> items) {
        int totalCost = 0;

        for (Item item : items) {
            totalCost += item.getCost();
        }

        return totalCost;
    }
}
