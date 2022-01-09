package hw_anna.lesson6;

public class Main {

    public static void main(String[] args) {

        Tree<Integer> tree = new TreeImpl<>();

        tree.add(60);
        tree.add(50);
        tree.add(66);
        tree.add(40);
        tree.add(55);
        tree.add(70);
        tree.add(31);
        tree.add(45);
        tree.add(42);
        tree.add(43);
        tree.add(69);
        tree.add(67);
        tree.add(68);
        tree.add(81);

        tree.display();
//
//        tree.remove(31);
//        tree.remove(42);
//        tree.remove(70);
//        tree.remove(40);
        tree.remove(60);
//
        tree.display();
//
        tree.traverse(Tree.TraversMode.IN_ORDER);
        tree.traverse(Tree.TraversMode.PRE_ORDER);
        tree.traverse(Tree.TraversMode.POST_ORDER);

    }
}
