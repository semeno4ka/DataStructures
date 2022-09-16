public class SinglyLinkedLIstApp {
    public static void main(String[] args) {

        MySinglyLinkedList myList=new MySinglyLinkedList();
        System.out.println(myList.isEmpty());//true, if head is empty, the list is empty

        for (int i = 0; i <10 ; i++) {
            myList.add(i);
        }
        myList.printNodes();
        myList.deletebyId(7);
        myList.printNodes();
        myList.deletebyId(0);
        myList.printNodes();
        myList.deletebyId(9);
        myList.printNodes();

        System.out.println(myList.indexOf(6));// index of element 6 is equal to 5

        System.out.println("--------------------------------------");
        myList.printNodes();
        System.out.println(myList.getKthFromLast(3));
        myList.removeKthFromLast(3);
        myList.printNodes();
    }
}
