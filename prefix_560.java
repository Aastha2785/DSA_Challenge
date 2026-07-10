// 560. Sub arrays sum equals to K
// used the approach of prefix sum

import java.util.*;
public class prefix_560 {
    public static void main(String args[]){
        int nums[]={1,2,3,4,5};
        int k=3;
        HashMap<Integer,Integer> h =new HashMap<>();
        h.put(0,1);
        int sum=0,c=0;
        for(int n:nums){
            sum=sum+n;
            if(h.containsKey(sum-k)){
                c=c+h.get(sum-k);
            }
            h.put(sum,h.getOrDefault(h,sum));
        }
    }
}
