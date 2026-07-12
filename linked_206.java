// 206. Reverse a linked list
// basic reversal of a linked list

class ListNode{
    ListNode next;
    int val;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}

public class linked_206 {
    public static void main(String argsp[]){
        ListNode head=new ListNode(1);
        head.next=new ListNode(4);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(3);
        System.out.println("Original array");
        ListNode pr=head;
        while(pr!=null){
            System.out.print(pr.val+" ");
            pr=pr.next;
        }
        ListNode curr=head;
        ListNode pre=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        ListNode x=pre;
        System.out.println();
        System.out.println("new array");;
        while(x!=null){
            System.out.print(x.val+" ");
            x=x.next;
        }

    }
}
