// 2461. Maximum Sum of Distinct Subarrays With Length K
// Used HashMap to solve it 
// Stored element and their frequency in hashmap if duplicate is found then size of hashmap will be less than k and the freq of duplicate will increase 
import java.util.*;
class sliding_2461{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]={1,5,4,9,9,9};
        int k=3,i;
        long s=0,max=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(i=0;i<k;i++){
            h.put(ar[i],h.getOrDefault(ar[i],0)+1);
            s=s+ar[i];
            if(h.size()==k)
                max=s;
        }
        for(int j=i;j<ar.length;j++){
            h.put(ar[j],h.getOrDefault(ar[j],0)+1);
            h.put(ar[j-i],h.get(ar[j-i])-1);
            s=s+ar[j]-ar[j-i];
            if(h.get(ar[j-i])==0)
                h.remove(ar[j-i]);
            if(h.size()==k && max<s)
                max=s;

        }
        System.out.println(max);
    }
}