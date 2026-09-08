class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class partition {
    public static void main(String args[]){
    ListNode li=new ListNode(2);
        li.next=new ListNode(3);
        li.next.next=new ListNode(4);
        li.next.next.next=new ListNode(6);
        li.next.next.next.next=new ListNode(1);
        li.next.next.next.next.next=new ListNode(7);
        li.next.next.next.next.next.next=new ListNode(8);
        int x=4;
        ListNode dum1=new ListNode(0);
        ListNode pr1=dum1;
        ListNode dum2=new ListNode(0);
        ListNode pr2=dum2;

        ListNode cur=li;
        while(cur!=null){
            if(cur.val<x)
            {
                pr1.next=cur;
                pr1=cur;
            }
            else{
                pr2.next=cur;
                pr2=cur;
            }
            cur=cur.next;
        }
        pr2.next=null;
        pr1.next=dum2.next;

        dum1 =dum1.next;
        while(dum1!=null){
            System.out.print(dum1.val+" ");
            dum1=dum1.next;
        }

    }
}
