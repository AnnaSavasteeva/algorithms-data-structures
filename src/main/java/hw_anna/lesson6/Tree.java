package hw_anna.lesson6;

public interface Tree<E extends Comparable<? super E>> {

    enum TraversMode {
        IN_ORDER, PRE_ORDER, POST_ORDER
    }

    int getDepthLeft();

    int getDepthRight();

    boolean add(E value);

    boolean contains(E value);

    boolean remove(E value);

    boolean isEmpty();

    boolean isBalanced();

    int size();

    void display();

    void traverse(TraversMode mode);

}
