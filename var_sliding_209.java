// 209. Minimum Size Subarray Sum
// Used the concept of variable sliding window
public class var_sliding_209 {
    public static void main(String args[]){
        int n[]={2,3,1,2,4,3};
        int t=7;
        int r=0,max=1000000,x=0,sum=0;
        for(int i=0;i<n.length;i++){
            sum=sum+n[i];
            x++;
            if(sum>=t && x<max){
                max=x;
            }
            while(sum>t){
                sum=sum-n[r];
                r++;
                x--;
                if(sum>=t && x<max){
                max=x;
            }
            }
            
        }
        if(max==1000000)
        max=0;
    }
}
