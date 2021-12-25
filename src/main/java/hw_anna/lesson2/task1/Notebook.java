package hw_anna.lesson2.task1;

import lombok.*;
import java.util.Comparator;

@Value
public class Notebook {
    int price;
    int ram;
    Producer producer;

    public static Comparator<Notebook> NotebooksComparator = Comparator.comparingInt((Notebook o) -> o.price)
            .thenComparingInt(o -> o.ram)
            .thenComparing(o -> o.producer);

    @Override
    public String toString() {
        return "Notebook{" +
                "price=" + price +
                ", ram=" + ram +
                ", brand=" + producer +
                '}';
    }
}
