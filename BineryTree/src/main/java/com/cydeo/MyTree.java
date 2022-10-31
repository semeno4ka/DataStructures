package com.cydeo;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {

    TNode root;

    public MyTree() {
    }

    void insert(int value) {
        TNode newNode = new TNode(value);
        if (root == null) {
            root = newNode;
            return;
        }

        TNode current = root;
        while (true) {
            if(value<= current.value){
                if(current.leftChild==null){
                    // if left is null insert there!!!
                    current.leftChild=newNode;
                    break;
                }
                //if leftChild is not null branch into left subtree!!
               current=current.leftChild;
            }
            else{
                if(current.rightChild==null){
                    current.rightChild=newNode;
                    break;  // if right is null insert there!!!
                }
                //if rightChild is not null branch into right subtree!!
                current=current.rightChild;
            }

        }
    }

    //Pre-order Traversal of the tree
    //Root-Left-Right
    void preOrderTraversal(TNode root){
   if(root==null) return;
        System.out.println(root.value);
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    //In-order Traversal (In binary tree it is always ascending order)
    void inOrderTraversal(TNode root){
        if(root==null) return;
        inOrderTraversal(root.leftChild);
        System.out.println(root.value);
        inOrderTraversal(root.rightChild);
    }

    //Post_order Traversal
    void postOrderTraversal(TNode root){
        if(root==null)return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.println(root.value);
    }

    void levelOrderTraversal(){
        if(root==null)return;
        Queue<TNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TNode toVisit=queue.poll();
            System.out.println(toVisit.value);
            if(toVisit.leftChild!=null) queue.add(toVisit.leftChild);
            if(toVisit.rightChild!=null) queue.add(toVisit.rightChild);
        }
     }
}
