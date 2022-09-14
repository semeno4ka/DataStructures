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


}

