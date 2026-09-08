class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class rotate {
    public static void main(String args[]){
    ListNode li=new ListNode(2);
        li.next=new ListNode(3);
        li.next.next=new ListNode(4);
        li.next.next.next=new ListNode(6);
        li.next.next.next.next=new ListNode(1);
        li.next.next.next.next.next=new ListNode(7);
        li.next.next.next.next.next.next=new ListNode(8);
        int k=3;
        ListNode p=li;
        int l=0;
        while(p!=null){
            l++;
            System.out.print(p.val+" ");
            p=p.next;
        }
        System.out.println();
        p=li;
        ListNode cur=li;
        for(int i=0;i<l-k-1;i++){
            cur=cur.next;
        }
        ListNode st=cur.next;
        ListNode dum=st;
        cur.next=null;
        while(dum.next!=null){
            dum=dum.next;
        }
        dum.next=p;
        while(st!=null){
            System.out.print(st.val+" ");
            st=st.next;
        }
}
}
