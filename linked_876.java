// 876. Middle of a linked List
class ListNode{
    ListNode next;
    int val;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class linked_876 {
    public static void main(String args[]){
        ListNode head=new ListNode(6);
        head.next=new ListNode(3);
        head.next.next=new ListNode(4);
        head.next.next.next=new ListNode(1);
        head.next.next.next.next=new ListNode(0);
        ListNode fast=head;
        ListNode slow=head;
        
        while(fast.next!=null && fast!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
System.out.println(slow.val);
    }
}
