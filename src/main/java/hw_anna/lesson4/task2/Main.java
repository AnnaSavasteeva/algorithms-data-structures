package hw_anna.lesson4.task2;

import hw_anna.lesson4.task1.SimpleLinkedListImpl;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        testIterator();
    }

    private static void testIterator() {
        SimpleLinkedListImpl<Integer> simpleLinkedList = new SimpleLinkedListImpl<>();
        simpleLinkedList.insertFirst(1);
        simpleLinkedList.insertFirst(2);
        simpleLinkedList.insertFirst(3);
        simpleLinkedList.insertFirst(4);
        simpleLinkedList.insertFirst(5);

        Iterator<Integer> iterator = simpleLinkedList.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.println(integer);
        }

    }
}
