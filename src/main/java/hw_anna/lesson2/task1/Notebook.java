package hw_anna.lesson2.task1;

import java.util.Comparator;

public class Notebook {
    private final int price;
    private final int ram;
    private final String brand;

    public Notebook(int price, int ram, String brand) {
        this.price = price;
        this.ram = ram;
        this.brand = brand;
    }

    public static Comparator<Notebook> NotebooksComparator = Comparator.comparingInt((Notebook o) -> o.price)
            .thenComparingInt(o -> o.ram)
            .thenComparing(o -> o.brand);

    @Override
    public String toString() {
        return "Notebook{" +
                "price=" + price +
                ", ram=" + ram +
                ", brand=" + brand +
                '}';
    }
}
