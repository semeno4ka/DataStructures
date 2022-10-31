import java.util.NoSuchElementException;

public class MyQueue <T>{

    T value;
    QNode<T> front;
    QNode<T> back;
    int size;

    boolean isEmpty(){return front==null;}
    T peek(){return (T)front.value;}

    void enqueue(T item){
        QNode<T> node=new QNode<>(item);
        if(isEmpty()){front=back=node;}
        else{ back.next=node;
              back=node;
        }
        size++;
    }
    T dequeue(){// deletes the first
        QNode frontNode;//temporary
        if(isEmpty()){ throw new NoSuchElementException();}//if empty
        if(front==back){// if just one item if(size==1)
            frontNode=front;
            front=back=null;
        }
        else{ //more than obe elements
            frontNode=front;// for keeping what was 1st element to return it
            front=front.next;// to assign 2nd node as new 1st node
        }
        size--;
        return (T) frontNode.value;

    }

    int size(){return size;}
    void printQueue(){
        if (isEmpty()) return;
        QNode<T> current=front;
        while(current!=null) {
            System.out.print(current.value);
            if(current.next!=null) System.out.print(", ");
            current=current.next;
        }
    }
}
