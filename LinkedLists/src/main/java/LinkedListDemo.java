import java.util.ArrayList;

public class LinkedListDemo {
    public static void main(String[] args) {

        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);// as of now, node are not linked

        // Creating connection between nodes
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        //Printing Nodes
        System.out.println(node1);
        System.out.println(node2);
        System.out.println(node3);
        System.out.println(node4);
        /*Since connection is made, node1.next will print the exact address of next element,
        which before linking, was NULL by default*/

        System.out.println(node1);//Node@2c8d66b2
        System.out.println("Next to node1: "+node1.next);//Next to node1: Node@5a39699c
        System.out.println("Next to node2: "+node2.next+" node2 next node id: "+node2.next.id);// Node@3cb5cdba node2 next node id: 3
        System.out.println("Next to node4: "+node4.next);// Next to node4:null

        Node current;
        Node head=node1;
        current=head;
        while(current!=null){
            System.out.println("Id of node: "+current.id);
            current=current.next;
        }



    }
}
