import java.util.*;
public class top_k_freq {
    public static void main(String args[]){
        int ar[]={1,1,1,2,2,3,4,4,4,4,4,5};
        int k=3;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:ar){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue((a,b)->h.get(a)-h.get(b));
        for(int i:h.keySet()){
            pq.add(i);
            if(pq.size()>k)
                pq.poll();
        }
        int x[]=new int[k];
        int i=0;
        while(!pq.isEmpty()){
            x[i]=pq.poll();
            i++;
        }
        for( i=0;i<k;i++){
            System.out.println(x[i]);
        }
    }
}
