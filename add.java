class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class add {
        public static void main(String args[]){
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(3);
        l1.next.next=new ListNode(4);
        l1.next.next.next=new ListNode(6);
        ListNode l2=new ListNode(9);
        l2.next=new ListNode(3);
        l2.next.next=new ListNode(1);
        l2.next.next.next=new ListNode(0);
        l2.next.next.next.next=new ListNode(6);

        ListNode dum=new ListNode(0);
        ListNode p=dum;
        int y=-1;
        while(l1!=null && l2!=null){
            int x=l1.val+l2.val;
            if(y!=-1){
            x=x+y;
            y=-1;
            }
            if(x>9){
            y=1;
            x=x-10;
            }
            p.next=new ListNode(x);
            p=p.next;

            l1=l1.next;
            l2=l2.next;

        }
            while(l1!=null){
                int x=l1.val;
                if(y!=-1){
                x=y+l1.val;
                y=-1;
            }
            if(x>9){
                y=1;
                x=x-10;
            }
            p.next=new ListNode(x);
            p=p.next;

            l1=l1.next;
        }

        while(l2!=null){
                int x=l2.val;
                if(y!=-1){
                x=y+l2.val;
                y=-1;
            }
            if(x>9){
                y=1;
                x=x-10;
            }
            p.next=new ListNode(x);
            p=p.next;

            l2=l2.next;
        }
        if(y!=-1)
        p.next=new ListNode(1);
        dum=dum.next;
        while(dum!=null){
            System.out.print(dum.val+" ");
            dum=dum.next;
        }
        
}
    
}
