package MiddleNode;

public class MiddleNode {
    public static void main(String[] args) {
MySinglyLinkedList sll=new MySinglyLinkedList();
        for (int i = 1; i <=6 ; i++) {
            sll.add(i);
        }
        printMiddleNodes(sll);
    }

    public static void printMiddleNodes(MySinglyLinkedList sll){
//Create two pointers
        Node p1=sll.head;
        Node p2=sll.head;//speed x2
        //iterate over list
        while(p2!=sll.tail && p2.next!=sll.tail){// if the x2 pointer has'nt yet reached the tail or it's next is not tail
      //if it stops at tail- odd, if it stops before tail is next-even
        p1=p1.next;// single jump
        p2=p2.next.next;// jumps through over one
        }
if(p2==sll.tail){
    System.out.println(p1.id);
}else{
    System.out.println(p1.id+","+p1.next.id);
}

    }
}
/*
Find a middle of a linked list in one pass. If it has even number of nodes, there will be two middle nodes
We do not know the size of the list ahead of time
 */