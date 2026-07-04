// 1011. Capacity To Ship Packages within D days
// here also we are using binary search
// here I am increasing days when the load becomes greater than the m value 
// then updating the m value accordingly

public class binray_1011 {
    public static void main(String args[]){
        int w[]={1,2,3,4,5,6,7,8,9,10};
        int da=5;
        int max=-1,sum=0;
        for(int i=0;i<w.length;i++){
            sum=sum+w[i];
            if(max<w[i])
            max=w[i];
        }
        int l=max,r=sum,d=0,x=0;

        while(l<r){
            int m=(l+r)/2;
            d=0;
            x=0;
            for(int i=0;i<w.length;i++){
                
                if(x+w[i]>m){
                d++;
                x=0;
                }
                x=x+w[i];
            }
            if(x!=0)
            d++;
            if(d<=da)
            r=m;
            else
            l=m+1;
        }
        System.out.println(l);
    }
}
