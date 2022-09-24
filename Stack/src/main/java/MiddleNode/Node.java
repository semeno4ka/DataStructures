package MiddleNode;

public class Node {

    int id;
    Node next;// default for this address will be null, when the object created, unless you reassign it to next element

    public Node(int id) {
        this.id = id;
    }
}
