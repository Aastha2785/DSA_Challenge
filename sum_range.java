import java.util.*;
class sum_range{
    public static void main(String args[]){
        int nums[]={0,2,3,4,6,7,8,9,11,12,13};
        List<String> li=new ArrayList<>();
        if(nums.length==0)
        System.out.println(li);
        if(nums.length==1){
            li.add(String.valueOf(nums[0]));
            System.out.println(li);
        }
        int s=nums[0];
        int l=-1,x=1;
        for(int i=1;i<nums.length;i++){
            l=nums[i];
            if(l==s+x){
                x++;
                continue;
            }
            else{
                if(nums[i-1]==s){
                    li.add(String.valueOf(s));
                }
                else{
                    li.add(String.valueOf(s)+"->"+String.valueOf(nums[i-1]));
                }
                x=1;
                s=l;
            }

        }
        if(s==l){
            String str=String.valueOf(s);
                    li.add(str);
        }
        else{
                    String str=String.valueOf(s)+"->"+String.valueOf(l);
                    li.add(str);
                }
                System.out.println(li);
    }
}