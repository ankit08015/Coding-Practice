package QueueExample;

public class CustomQueue {

    private int[] arr;
    private int size;
    private int head;

    public CustomQueue(int length) {
        arr = new int[length];
        size = 0;
        head = -1;
    }

    public void enqueue(int num) {

        arr[++head] = num;
        size++;
    }

    public int dequeue() {

        if (size == 0) {
            return -1;
        } else {

            int first = arr[0];
            for (int i = 1; i <= size; i++) {
                arr[i - 1] = arr[i];
            }
            size--;
            return first;
        }
    }

    public int getSize() {
        return size;
    }

}
