// 162. Find peak element
// here we need to use binary search to get the peak element
public class binary_162 {
    public static void main(String args[]){
        int n[]={1,2,1,3,5,6,4};
        int l=0,r=n.length-1;
        while(l<r){
            int m=(l+r)/2;
            if(n[m]<n[m+1])
                l=m+1;
            else
                r=m;
        }
        System.out.println(l);
    }
}
