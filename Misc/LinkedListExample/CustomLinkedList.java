package LinkedListExample;

public class CustomLinkedList {

    private class Node {
        int value;
        Node next;

        private Node(int value) {
            this.value = value;
            next = null;

        }
    }

        private Node head;

        public CustomLinkedList(int val){
            head= new Node(val);
            //head.value=val;
           // head.next=null;
        }

        public void addLastElement(int val){
            Node n= new Node(val);

            Node temp= head;

            while(temp.next!=null){
                temp=temp.next;
            }

            temp.next=n;
        }

        public void printList(){
            Node temp=head;
            while(temp.next!=null){
                System.out.println(temp.value);
                temp=temp.next;
            }
            System.out.println(temp.value);

        }

        public void addFirstElement(int val){
            Node n= new Node(val);
            n.next=head;
            head=n;
        }

        public void deleteFirstElement(){
            head=head.next;
        }

        public void deleteLastElement() {
            Node temp = head;
            Node prev = null;

            if(head.next == null ||  head==null){
                head = null;
            }
            else{

                while (temp.next != null) {
                    prev = temp;
                    temp = temp.next;

                }
                prev.next = null;
            }
        }

        public CustomLinkedList reverse (CustomLinkedList ls){

            int length=0;

            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
                length++;
            }
            length++;

            for(int i=0;i<length;i++){

            }


            return ls;
        }

}
