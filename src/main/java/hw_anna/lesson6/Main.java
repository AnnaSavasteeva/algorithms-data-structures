package hw_anna.lesson6;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final int TREE_AMOUNT = 20;

    public static void main(String[] args) {
        List<Tree<Integer>> trees = new LinkedList<>();

        for (int i = 0; i < TREE_AMOUNT; i++) {
            trees.add(createTree());
        }

        for (Tree<Integer> tree : trees) {
            tree.display();
            System.out.println(tree.isBalanced());
            System.out.println();
            System.out.println();
        }

        getAmountOfUnbalancedTrees(trees);
    }

    private static void getAmountOfUnbalancedTrees(List<Tree<Integer>> trees) {
        int unbalancedTreesCount = 0;

        for (Tree<Integer> tree : trees) {
            if (!tree.isBalanced()) {
                unbalancedTreesCount++;
            }
        }

        System.out.println("% of unbalanced trees: " + (unbalancedTreesCount * 100 / TREE_AMOUNT));
    }

    private static Tree<Integer> createTree() {
        Tree<Integer> tree = new TreeImpl<>();
        fillTree(tree);
        return tree;
    }

    private static void fillTree(Tree<Integer> tree) {
        Random rand = new Random();
        while (tree.getDepthLeft() < 4 && tree.getDepthRight() < 4) {
            tree.add(rand.nextInt(-26, 26));
        }
    }
}
