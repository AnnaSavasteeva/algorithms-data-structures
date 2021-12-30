package hw_anna.lesson4.task1;

public class Main {

    public static void main(String[] args) {
        DequeImpl<Integer> dequeImpl = new DequeImpl<>();

        dequeImpl.insertFirst(1);
        dequeImpl.insertFirst(2);
        dequeImpl.insertFirst(3);
        dequeImpl.insertFirst(4);
        dequeImpl.insertFirst(5);
        dequeImpl.display();

        dequeImpl.insert(700, 2);
        dequeImpl.display();
    }

}
