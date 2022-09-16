import java.util.Deque;
import java.util.LinkedList;

public class CollectionStack {
    public static void main(String[] args) {

        Deque<Integer> cStack=new LinkedList<>();//doubly linked implementation
        cStack.push(1);
        cStack.push(2);
        cStack.push(3);
        System.out.println(cStack.peek());// uses same stack methods
        System.out.println(cStack.pop());// shows and removes
        System.out.println(cStack.peek());// shows new top



    }
}
