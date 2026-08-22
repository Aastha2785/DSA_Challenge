import java.util.*;
public class sliding_w {
    public static void main(String args[]){
        int ar[]={2,1,3,1,3,1,2,1,1,3};
        int k=3;
        int l=0,max=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<ar.length;i++){
            h.put(ar[i],h.getOrDefault(ar[i],0)+1);
            while(h.get(ar[i])>k){
                h.put(ar[l],h.get(ar[l])-1);
                l++;
            }
            max=Math.max(i-l+1,max);
        }
System.err.println(max);


    }
}
