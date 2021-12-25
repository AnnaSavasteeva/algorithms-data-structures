package lesson3;

import lesson3.queue.Queue;
import lesson3.stack.Stack;
import lesson4.LinkedListStack;
import lesson4.LinkedQueue;


public class Test3 {

    public static void main(String[] args) {
//        testStack();
        testQueue();
    }

    private static void testStack() {

//        Stack<Integer> stack = new StackImpl<>(4);
        Stack<Integer> stack = new LinkedListStack<>();

        System.out.println(addToStack(stack, 12));
        System.out.println(addToStack(stack, 16));
        System.out.println(addToStack(stack, 22));
        System.out.println(addToStack(stack, 5));
        System.out.println(addToStack(stack, 1));
        System.out.println(addToStack(stack, 32));

        stack.display();

        System.out.println("top value: " + stack.pop() );
        System.out.println("top value: " + stack.peek() );
        stack.display();
    }

    private static boolean addToStack(Stack<Integer> stack, int num) {
        if (!stack.isFull()) {
            stack.push(num);
            return true;
        }
        return false;
    }

    private static void testQueue() {

//        Queue<Integer> queue = new QueueImpl<>(4);
        Queue<Integer> queue = new LinkedQueue<>();

        System.out.println("add element: " + queue.insert(34));
        System.out.println("add element: " + queue.insert(12));
        System.out.println("add element: " + queue.insert(20));
        System.out.println("add element: " + queue.insert(16));
        System.out.println("add element: " + queue.insert(14));
        System.out.println("add element: " + queue.insert(17));

        queue.display();
        System.out.println("remove: " + queue.remove());
        queue.display();

    }

}
