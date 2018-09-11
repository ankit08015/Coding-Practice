package LinkedListExample;

public class TestLinkedList {

    public static void main(String [] args){

        CustomLinkedList ls= new CustomLinkedList(10);
        ls.printList();
        ls.addLastElement(23);
        ls.printList();
        ls.addLastElement(45);
        ls.addLastElement(67);
        ls.printList();
        ls.addFirstElement(5);
        ls.printList();
        ls.deleteFirstElement();
        ls.printList();
        ls.deleteLastElement();
        ls.printList();
    }
}
