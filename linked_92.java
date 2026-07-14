// 92. Reverse LinkedList II
// break the linked list into 3 parts then combine all three

class ListNode{
    ListNode next;
    int val;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class linked_92 {
    public static void main(String args[]){
        ListNode l=new ListNode(5);
        l.next=new ListNode(1);
        l.next.next=new ListNode(2);
        l.next.next.next=new ListNode(8);
        l.next.next.next.next=new ListNode(3);
        l.next.next.next.next.next=new ListNode(6);
        int le=3,r=5;
        ListNode d=new ListNode(0);
        d.next=l;
        ListNode p=d;
        for(int i=0;i<le-1;i++){
            p=p.next;
        }
        ListNode cur=p.next;
        ListNode prv=null;
        for(int i=0;i<r-le+1;i++){
            ListNode n=cur.next;
            cur.next=prv;
            prv=cur;
            cur=n;
        }
        p.next.next=cur;
        p.next=prv;

ListNode x=d.next;
while(x!=null){
    System.out.println(x.val);
    x=x.next;
}

    }
}
