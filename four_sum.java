// 18. 4Sum
// same as 3Sum just one more for loop for the 4th number
import java.util.*;
public class four_sum {
    public static void main(String args[]){
        int nums[]={1,0,-1,0,-2,2};
            int t=0;
        List<List<Integer>> ar=new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            
            if(i>0 && nums[i]==nums[i-1])
            continue;
            for(int j=i+1;j<nums.length;j++){
                int l=j+1,r=nums.length-1;
                if(j>i+1 && nums[j]==nums[j-1])
            continue;
            
            while(l<r){
                long s=(long)nums[i];
                s=s+nums[l]+nums[r]+nums[j];
                if(s>t)
                r--;
                else if(s<t)
                l++;
                else
                {
                    
                    ar.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[l],nums[r])));
                    r--;
                    l++;
                    while(l<r && nums[l]==nums[l-1])
                    l++;
                    while(l<r && nums[r]==nums[r+1])
                    r--;
                }
            }
            }

        }
        System.out.println(ar);

    }
}
