// 15. 3sum
// used the concept of two pointeers but inside a for loop to track the 3rd number
// you need to skip the same numbers 
import java.util.*;
public class two_point_15 {
    public static void main(String args[]){
        int nums[]={-1,0,1,2,-1,-4};
        List<List<Integer>> ar=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int s=0,l=i+1,r=nums.length-1;
            if(i>0 && nums[i]==nums[i-1])
                continue;
            while(l<r){
                s=nums[i]+nums[l]+nums[r];
                if(s<0){
                    l++;
                }
                else if(s>0){
                    r--;
                }
                else{
                    ar.add(new ArrayList<>(Arrays.asList(nums[i],nums[l],nums[r])));
                    r--;
                    l++;
                    while(l<r && nums[l]==nums[l-1])
                        l++;
                    while(l<r && nums[r]==nums[r+1])
                        r--;
                }
            }
        }
        System.out.println(ar);
    }
}
