package datastructures.binarysearchtree.levelorder;

/**
 * BST is always interesting to learn and to see the recursions magic
 * A different approach to check the ordering whichever the element on the same floor.
 * @author  Thiruthuva Rajan J
 * @version 1.0
 * @since   2021-07-09
 */
public class BSTMain {

    public static void main(String[] args) {
        BSTree bsTree = new BSTree();
        bsTree.add(80);
        bsTree.add(40);
        bsTree.add(101);
        bsTree.add(102);
        bsTree.add(81);
        bsTree.add(85);
        bsTree.add(30);
        bsTree.add(20);
        bsTree.add(10);
        bsTree.printLevelOrder();
    }
}
