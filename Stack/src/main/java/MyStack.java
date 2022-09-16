import java.util.NoSuchElementException;

public class MyStack<T> {


    public StackNode<T> bottom;
    public StackNode<T> top;
    int size;

    public boolean isEmpty(){
        return bottom==null;
    }

    public void push(T item){
        StackNode<T> node=new StackNode<>(item);
        if(isEmpty()){
            bottom=top=node;
        }else{
            top.next=node;// is there sequence difference?
            top=node;// is there sequence difference?
        }
        size++;
    }

    public T peek(){
        return (T)top.value;
    }
    public T pop(){
        StackNode peekNode;
        if(isEmpty()){throw new NoSuchElementException();}
        // if stack has one element
        if(top==bottom){
            peekNode=top;
            top=null;
            bottom=null;
            size--;
        }else{// more than one element
            peekNode=top;
            StackNode previous=bottom;
            while(previous.next!=top){
                previous=previous.next;
            }//after it reaches previous.next is null, it jumps out and assigns this previous next to null and top to previous
            previous.next=null;
            top=previous;
            size--;
        }
        return (T) peekNode.value;
    }
}
