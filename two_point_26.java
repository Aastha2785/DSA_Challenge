// 26. Remove duplicates from sorted array
// Used the concept of fast slow two pointers 
// fast counter searches among the whole array slow counter replaces the elements in nums with the non repeating ones 
public class two_point_26 {
    public static void main(String args[]){
        int nums[]={0,0,1,1,2,2,2,3,3,4};
        int s=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[s])
            {
                s++;
                nums[s]=nums[i];
            }
        }
        for(int i=0;i<s+1;i++)
        System.out.println(nums[i]);
    }
}
