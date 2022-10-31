import java.util.Stack;

public class ReverseFirstKElementsInQueue {
    public static void main(String[] args) {

   MyQueue<Integer> queue =new MyQueue<>();
        for (int i = 1; i <6 ; i++) {
            queue.enqueue(i);
        }
        System.out.println("initial queue");
        queue.printQueue();
        System.out.println();
        System.out.println("After reverse");
        reverseFirstK(queue,3).printQueue();


    }
    static MyQueue<Integer> reverseFirstK(MyQueue<Integer> queue, int k){
        Stack<Integer> stack=new Stack<>();
        //push first K elements to stack
        for (int i=0; i<k; i++){
            stack.push(queue.dequeue());
        }//enqueue  elements back into queue
        while(!stack.isEmpty()){
            queue.enqueue(stack.pop());
        }
        //dequeue and enqueue size of queue-k
        for (int i = 0; i < queue.size-k ; i++) {
            queue.enqueue(queue.dequeue());
        }

        return queue;

    }
}

