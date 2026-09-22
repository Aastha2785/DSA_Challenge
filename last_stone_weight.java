import java.util.*;
class last_stone_weight{
    public static void main(String args[]){
        int st[]={5,8,6,3,1,9,3};
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<st.length;i++){
            pq.add(st[i]);
        }
        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();
            if(x==y){

            }
            else{
                pq.add(Math.abs(x-y));
            }
        }
        if(pq.isEmpty())
        System.out.println(0);
        else 
        System.out.println(pq.peek());
    }
}