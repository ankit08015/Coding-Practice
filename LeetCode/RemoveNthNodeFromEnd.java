import java.util.List;

public class RemoveNthNodeFromEnd {

    //  Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

        public ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode first=head;
            ListNode second=head;

            int j=0;
            for(j=0;j<n;j++){
                if(first!=null){
                    first=first.next;
                }
                else break;
            }
            if(j<n)return null;
            if(j==n&&first==null)return head.next;
            while(first.next!=null){
                first=first.next;
                second=second.next;
            }

            second.next=second.next.next;


            return head;

        }
}
