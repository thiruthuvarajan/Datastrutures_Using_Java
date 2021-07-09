package datastructures.binarysearchtree.levelorder;

public class BSTree {

    private Node bst;
    private static int maxLevel =0; //

    public void add(int data) {
        if(bst == null){
            this.bst = new Node(data);
        }else addRecursive(bst,data);
    }

    private void addRecursive(Node node,int data) {
        if(node.getData()>data){
            if(node.left != null) {
                addRecursive(node.left, data);
            }else node.setLeft(new Node(data));
        }else{
            if(node.right != null) {
                addRecursive(node.right,data);
            }else node.setRight(new Node(data));
        }
    }

    public void printLevelOrder() {
        int height = getHeight();
        for(int i=0;i<height;i++) {
            maxLevel = i;
            System.out.println("Printing Level: " + i);
            printLvlOrder(bst, 0);
            System.out.println();
        }
    }

    private void printLvlOrder(Node node, int level) {
        if(node == null){
            return;
        }

        if(level==maxLevel){
            System.out.print(node.getData()+" ");
        }

        if(node.getLeft()!=null) printLvlOrder(node.left,level+1);
        if(node.getRight()!=null) printLvlOrder(node.right,level+1);
    }

    private int getHeight() {
        return getTHeight(bst);
    }

    private int getTHeight(Node node) {
        if(node == null){
            return 0;
        }

        int left = getTHeight(node.left);
        int right = getTHeight(node.right);

        if(left>right){
            return left+1;
        }else return right+1;

    }
}
