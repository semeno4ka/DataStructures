public class SinglyLinkedLIstApp {
    public static void main(String[] args) {

        MySinglyLinkedList myList=new MySinglyLinkedList();
        System.out.println(myList.isEmpty());//true, if head is empty, the list is empty

        for (int i = 0; i <10 ; i++) {
            myList.add(i);
        }
        myList.printNodes();
    }
}
