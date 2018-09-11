public class CustomStack {

    private int [] a;
    private int size;
    private int top;

    public CustomStack(int num){

        a= new int[num];
        size=0;
        top=-1;
    }

    public void push(int num){
        top++;
        a[top]=num;
       // top++;
        size++;

    }

    public int pop(){
        if(size==0){
            return -1;
        }


          int pop=a[top];
            top--;
            size--;
            return pop;
    }

    public int seek(){
        if(size==0){
            return -1;
        }
        else {
            return a[top];
        }
          }

    public int getSize(){
        return size;
    }
}
