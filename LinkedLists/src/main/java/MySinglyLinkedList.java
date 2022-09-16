public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        // create a new object frin data
        Node node = new Node(data);
        if (isEmpty()) {// if the list is empty
            head = tail = node;
        } else {// if has elements
            tail.next = node;
            tail = node;
            size++;
        }
    }

    void printNodes() {
        Node current = head;
        while (current != null) {
            if (current.next == null) {
                System.out.println(current.id + " is null");
            } else {
                System.out.print(current.id + " => ");
            }
            current = current.next;
        }
    }

    void deletebyId(int id) {
//check if empty
        if (isEmpty()) {
            System.out.println("List is empty");
        }
// if not empty
        Node prev = head;// we assign head as previous to keep it
        Node current = head;// assign current as head
        while (current != null) {
            if (current.id == id) {
                if (current == head) {// if its the first element
                    head = current.next;//we assign next element as head
                    current.next = null;// we assign null as next to our 1st value, so that it can break connection
                }
                else if (current == tail) {
                    tail = prev;//we assign previous element as tail and next to previous(current tail) as null
                    prev.next = null;//ex tail will be eligible for Garbage collection
                }
                else {
                    prev.next = current.next;//previous next pointer will be assigned to current value next pointer- the previous next 3 will now be assign previous next 4
                    current.next = null;//to break connection we assign next as null
                }
                size--;
            }
            //move forward on the elements of the list
            prev = current;
            current = current.next;
        }
    }

int indexOf(int id){
        if(isEmpty()){return -1;}// not in the list
        int position=0;
        //iterate through the list
    Node current=head;// set starting point
    while(current!=null){
        if(current.id==id){ return position; }// head id is required id means index 0
        position++;// if not index 0, then increase position and assign current to current next to check if current id == 1
        current=current.next;
    }
return -1;
}

void addFirst(int data){
        Node node=new Node(data);
        if(isEmpty()){
            head=tail=node;
        }else{
            node.next=head;
            head=node;
        }
        // increase size
    size++;
}

public int getKthFromLast(int k){ //can start iteration from 1, then use just K not k-1
        Node p1=head;// create two pointers
        Node p2=head;
    for (int i = 0; i <k-1 ; i++) {
        p2=p2.next; // move pointer2 K-1 number of times
    }
    while(p2.next!=null){ // move both till p2 hits null
        p1=p1.next;
        p2=p2.next;
    }
    //return location of pointer1 which is at Kth from end
    return p1.id;

}

public void removeKthFromLast(int k){// need additional pointer to keep information of previous
        //create three pointers
    Node p1=head;
    Node p2=head;
    Node prev=head;// could be null
    for (int i = 0; i <k-1 ; i++) {
        p2=p2.next; // move pointer2 K-1 number of times
    }
    while(p2.next!=null){
        prev=p1;
        p1=p1.next;
        p2=p2.next;
    }
    //there are three possibilities: delete from first, last and middle
    if(p1==head){
        head=p1.next;
        p1.next=null;
        size--;
    }else if(p1==tail){
        tail=prev;
        prev.next=null;
        size--;
    }else{
        prev.next=p1.next;
        p1.next=null;
        size--;
    }
}
    public void removeKthFromLast2(int k){
        Node ptr1=head;
        Node ptr2=head;

        for(int i=0;i<k-1;i++) {

            ptr2=ptr2.next;

            if (ptr2==null)  System.out.println("Less than k elements");

            else if(ptr2.next==null){
                head=ptr1.next;
                ptr1.next=null;
                return;
            }
        }
        while(ptr2.next.next!=null) {

            ptr1=ptr1.next;
            ptr2=ptr2.next;

        }
        ptr1.next=ptr1.next.next;
        ptr1=ptr1.next;
        ptr1=null;
    }

}

