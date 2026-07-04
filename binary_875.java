// 875. KOko eating bananas
// used binary search to calculate the speed of koko
// calcuated the maximum eating time 
// then checked with all the eating time
// if hrs is less than given time then decrease the speed other wise increase the speed

public class binary_875 {
    public static void main(String args[]){
        int p[]={3,6,7,11};
        int h=8;
        int max=-1;
        for(int i=0;i<p.length;i++){
            if(max<p[i])
            max=p[i];
        }
        int l=1,r=max;
        int hrs=0;
        while(l<r)
        {
            int m=(l+r)/2;
            hrs=0;
            for(int pi:p){
                hrs=hrs+(pi+m-1)/m;
            }
            if(hrs>h){
                l=m+1;
            }
            else
            r=m;
        }
System.out.println(l);
    }
}
