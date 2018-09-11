import java.util.List;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=new ListNode(0);
        ListNode temp3=res;
        if(l1==null&&l2==null)return res;

        if(l1==null)return l2;
        if(l2==null)return l1;


        ListNode temp1=l1, temp2=l2;
        int sum=0,carry=0;


        while(temp1 != null || temp2 != null)
        {
            int val1 =0, val2 =0;
            if(temp1 != null)
                val1 = temp1.val;
            if(temp2 != null)
                val2 = temp2.val;

            sum = (val1 + val2 + carry)%10;
            carry = (val1 + val2)/10;

            temp3.next = new ListNode(sum);
            temp3 = temp3.next;

            temp1 = temp1.next;
            temp2 = temp2.next;

        }

        if(carry != 0)
        {
            temp3.next = new ListNode(carry);
        }

        return res.next;

        /*

        while(temp1.next!=null && temp2.next!=null){
           sum=0;
           sum=temp1.val+temp2.val;
           carry=sum/10;
           sum=sum%10;

           temp3.val=sum+temp3.val;
           temp3.next= new ListNode(carry);
           carry=0;
           temp3=temp3.next;
           temp1=temp1.next;
           temp2=temp2.next;
        }
        if(temp1.next==null&&temp2.next==null) {
            sum = temp1.val + temp2.val + temp3.val;
            carry = sum / 10;
            sum = sum % 10;
            temp3.val = sum;
            if(carry==1)
            temp3.next = new ListNode(carry);
        }
        else if(temp1.next==null){
          //  while(temp2.next!=null){
                temp3.next=temp2.next;
              //  temp2=temp2.next;
             //   temp3=temp3.next;
           // }
        }
        else   if(temp2.next==null){
           // while(temp1.next!=null){
                temp3.next=temp1.next;
              //  temp1=temp1.next;
               // temp3=temp3.next;
           // }
        }




        return res;

        */
    }

    public static void main(String args[]){
        ListNode l1=new ListNode(5);
       // l1.next=new ListNode(4);
      //  l1.next.next=new ListNode(3);

        ListNode l2=new ListNode(5);
      //  l2.next=new ListNode(6);
      //  l2.next.next=new ListNode(4);

        System.out.println("Hello");

        ListNode temp=l1;

        while(temp.next!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }

        AddTwoNumbers a1= new AddTwoNumbers();

        ListNode res= a1.addTwoNumbers(l1,l2);

        ListNode temp2=res;

        while(temp2.next!=null){
            System.out.println(temp2.val);
            temp2=temp2.next;
        }
        System.out.println(temp2.val);

    }
}
