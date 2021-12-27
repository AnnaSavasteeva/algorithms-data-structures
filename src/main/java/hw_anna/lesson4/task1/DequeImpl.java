package hw_anna.lesson4.task1;

public class DequeImpl<E> extends TwoSideLinkedListImpl<E> implements Deque<E> {

    @Override
    public void insert(E value, int index) {
        if (index == 0) {
            super.insertFirst(value);
            return;
        }

        if (index == size) {
            super.insertLast(value);
            return;
        }

        Node<E> prevElement = first;
        Node<E> nextElement = prevElement.next;
        for (int i = 1; i <= index; i++) {
            if (i == index) {
                prevElement.next = new Node<>(value, nextElement);
                size++;
                return;
            }
            prevElement = nextElement;
            nextElement = nextElement.next;
        }
    }
}
