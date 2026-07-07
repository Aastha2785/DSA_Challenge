// 80. Remove duplicates from sorted array II
// concept of two poiinters

public class two_point_80 {
    public static void main(String args[]){
        int nums[]={1,1,1,2,2,3,4,4,4,4,5};
        int s=1;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[s] || nums[i]!=nums[s-1])
            {
                s++;
                nums[s]=nums[i];
            }
        }
        for(int i=0;i<s+1;i++){
            System.out.println(nums[i]);
        }
    }
}
