// 27. Remove Elements
// used the concept of two pointers same as 26

public class two_point_27 {
    public static void main(String args[]){
        int nums[]={2,2,3,4,5,2,3,7,3};
        int v=3;
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=v){
                nums[s]=nums[i];
                s++;
            }
        }
        for(int i=0;i<s;i++){
            System.out.println(nums[i]);
        }
    }
}
