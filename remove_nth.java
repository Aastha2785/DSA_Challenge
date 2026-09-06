import java.util.*;
class ListNode{
int val;
ListNode next;
ListNode(int val){
    this.val=val;
    this.next=null;
}
}
class remove_nth{
    public static void main(String args[]){
        ListNode li=new ListNode(2);
        li.next=new ListNode(3);
        li.next.next=new ListNode(4);
        li.next.next.next=new ListNode(6);
        li.next.next.next.next=new ListNode(1);
        li.next.next.next.next.next=new ListNode(7);
        li.next.next.next.next.next.next=new ListNode(8);
        ListNode dum=new ListNode(0);
        dum.next=li;
        ListNode curr=li;
        ListNode x=li;
        while(x!=null){
            System.out.print(x.val+" ");
            x=x.next;
        }
        int n=3;
        int l=0;
        while(curr!=null){
            l++;
            curr=curr.next;
        }
        curr=dum;
        for(int i=0;i<l-n;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        x=dum.next;
        while(x!=null){
            System.out.print(x.val+" ");
            x=x.next;
        }


    }
}
