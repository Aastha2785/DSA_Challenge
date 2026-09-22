import java.util.PriorityQueue;

public class k_closest {
    public static void main(String args[]){
        int pt[][]={{2,-4},{3,5},{-3,-4},{3,3}};
        int k=2;

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1]));

        for(int i=0;i<pt.length;i++){
            pq.add(pt[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int ar[][]=new int[k][2];
        for(int i=0;i<k;i++){
            ar[i]=pq.poll();
        }
        for(int i=0;i<k;i++){
            System.out.println("["+ar[i][0]+","+ar[i][1]+"]");
        }
    }
}
