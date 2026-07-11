// 238. Product of array except self
// here first we are calculating the sum of all the prefix and storing them in ar
// then we are again multiply them from back side except that number

public class prefix_238 {
    public static void main(String args[]){
        int nums[]={2,3,1,4,0};
        int ar[]=new int[nums.length];
        int n=nums.length;
        int r=1;
        ar[0]=1;
        for(int i=1;i<n;i++){
            ar[i]=ar[i-1]*nums[i-1];
        }
        for(int i=n-1;i>=0;i--){
            ar[i]=ar[i]*r;
            r=r*nums[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(ar[i]);
        }
    }
}
