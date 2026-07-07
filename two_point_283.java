// 283. Move zeros
//  basic Two pointer question

public class two_point_283 {
    public static void main(String args[]){
        int nums[]={0,1,0,3,12};
        int s=0,q=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[s]=nums[i];
                s++;
            }
            
            
        }
        for(int i=s;i<nums.length;i++){
            nums[i]=0;
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
