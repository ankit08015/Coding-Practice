package QueueExample;

public class CustomQueueTest {


    public static void main(String [] args){
        CustomQueue cq= new CustomQueue(20);

        cq.enqueue(21);
        cq.enqueue(34);
        cq.enqueue(87);
        System.out.println(cq.getSize());
        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());
        System.out.println(cq.getSize());


    }


}
