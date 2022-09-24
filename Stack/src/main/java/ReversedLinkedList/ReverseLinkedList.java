package ReversedLinkedList;


public class ReverseLinkedList {
    public static void main(String[] args) {
        MySinglyLinkedList list = new MySinglyLinkedList();
        for (int i = 0; i <10 ; i++) {
            list.add(i);}
            list.printNodes();
            System.out.println("After reverse in one pass");
            reverse(list);
            list.printNodes();;
    }
    static void reverse(MySinglyLinkedList list){
        // create two pointers
        Node prev=list.head;
        Node current=list.head.next;
        //iterate
        while(current!=null){
            Node nextNode=current.next;//important for saving address for moving forward, without keeping track on next, won't be able to establish connection
            current.next=prev;// change direction of current to prev
            prev=current;//move prev to right to current
            current=nextNode;//move current to next
        }
        //adjust tail and head
        list.tail=list.head;
        list.tail.next=null;
        list.head=prev;


    }
}
