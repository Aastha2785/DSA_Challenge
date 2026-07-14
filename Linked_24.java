// 24. Swap Nodes in pairs
// connect the first node with the 3rd node and then connect 2nd node with the beginning of the first node

class ListNode{
    ListNode next;
    int val;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}

public class Linked_24 {
    public static void main(String args[]){
        ListNode l=new ListNode(5);
        l.next=new ListNode(1);
        l.next.next=new ListNode(2);
        l.next.next.next=new ListNode(8);
        l.next.next.next.next=new ListNode(3);
        // l.next.next.next.next.next=new ListNode(6);

        ListNode d=new ListNode(0);
        d.next=l;
        ListNode p=d;
        while(p.next!=null && p.next.next!=null){
            ListNode f=p.next;
            ListNode s=f.next;
            f.next=s.next;
            s.next=f;
            p.next=s;
            p=f;
        }
        ListNode x=d.next;
        while(x!=null){
            System.out.println(x.val);
            x=x.next;
        }
    }
}
