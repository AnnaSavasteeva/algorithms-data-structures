package hw_anna.lesson5.task2;

import lombok.*;

@Value
public class Item {

    static int ITEMS_COUNTER;
    int weight;
    int cost;
    String name;

    public Item(int weight, int cost) {
        this.weight = weight;
        this.cost = cost;
        this.name = "Объект " + ++ITEMS_COUNTER;
    }
}
