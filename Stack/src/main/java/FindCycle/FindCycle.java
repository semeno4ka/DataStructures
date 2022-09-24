package FindCycle;

import java.util.HashSet;

public class FindCycle {
    public static void main(String[] args) {
        ListNode n1=new ListNode(3);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(0);
        ListNode n4=new ListNode(4);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n2;
        System.out.println(hasCycle(n1));
    }
    public static boolean hasCycle(ListNode head){
// create a HashSet
        HashSet<ListNode> visited=new HashSet<>();
        //start current to head
        ListNode current=head;
        while(current!=null){
            if(visited.contains(current)){
                return true;}
                visited.add(current);
                current=current.next;
        }
        return false;
    }
}
/*
given a head, determine whether it has a cycle in the list
 */
