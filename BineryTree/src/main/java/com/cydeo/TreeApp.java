package com.cydeo;

public class TreeApp {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        int[] numbers = new int[]{20,10,14,6,3,8,30,24,26};
        for (int i = 0; i < 9; i++) {
            tree.insert(numbers[i]);
        }
        VisualizeTree.printTree(tree.root,null,false);
        //Visualize
        System.out.println("--------Pre-Order Traversal--------");
        tree.preOrderTraversal(tree.root);
        System.out.println("--------In-Order Traversal--------");
        tree.inOrderTraversal(tree.root);
        System.out.println("-------Post-Order Traversal---------");
        tree.postOrderTraversal(tree.root);
        System.out.println("-------Level Breadth Traversal---------");
        tree.levelOrderTraversal();
    }
}
