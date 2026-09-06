class ListNode{
int val;
ListNode next;
ListNode(int val){
    this.val=val;
    this.next=null;
}
}
public class remove_dupli {
    public static void main(String args[]){
        ListNode li=new ListNode(2);
        li.next=new ListNode(2);
        li.next.next=new ListNode(3);
        li.next.next.next=new ListNode(4);
        li.next.next.next.next=new ListNode(6);
        li.next.next.next.next.next=new ListNode(6);
        li.next.next.next.next.next.next=new ListNode(6);  
        ListNode dum=new ListNode(0);
        dum.next=li;
        ListNode prev=dum;
        ListNode cur=li;
        int z=-1;
        while(cur.next!=null){
            if(cur.val==cur.next.val){
                while(cur.val==cur.next.val){
                    cur=cur.next;
                    if(cur.next==null){
                        z=0;
                        break;
                    }
                }
                if(z==0){
                    prev.next=null;
                    break;
                }
                prev.next=cur.next;
                cur=cur.next;
            }
            else{
                prev=prev.next;
                cur=cur.next;
            }

        }
        ListNode x=dum.next;
        while(x!=null){
            System.out.print(x.val+" ");
            x=x.next;
        }
    }
}
