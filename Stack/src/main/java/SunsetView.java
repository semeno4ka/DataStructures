import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class SunsetView {
    public static void main(String[] args) {
int[] buildings={3,5,4,4,3,1,3,2};
sunsetView(buildings,"East").forEach(System.out::println);


    }
    public static ArrayList<Integer> sunsetView(int[] buildings, String direction){
Stack<Integer> stack=new Stack<Integer>();//stack to hold index that can see sunset
// for East by default
        int i=0;
        int step=1;
// for West
        if(direction.equalsIgnoreCase("west")){
            i=buildings.length-1;// starts from index 7
            step=-1; //(i=7 +(-1)=(i=6))
        }

        while(i>=0 && i<buildings.length) {
                       //if building hight is less or even to stacks peek- remove
                while (!stack.isEmpty() && buildings[i] >= buildings[stack.peek()]) {
                    stack.pop();
                }
                stack.push(i);// add i
                i+=step;
            }
            if(direction.equalsIgnoreCase("west")) Collections.reverse(stack);// we reverse since the answer should be in ascending order
        return new ArrayList<Integer>(stack);
    }
}
