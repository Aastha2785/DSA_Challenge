// 33. Search in Rotated array
// here the array is divided into two sorted arrays 
// if the middle is greater than the left one then left part is sorted otherwise the right part is sorted
// then check in the sorted arrays for the target

public class binray_33 {
    public static void main(String args[]){
        int n[]={4,5,6,7,0,1,2};
        int t=0;
        int r=n.length-1,l=0;
        while(l<=r){
            int m=(r+l)/2;
            if(n[m]==t)
            System.out.println(m);
            if(n[l]<=n[m]){
                if(n[l]<=t && t<n[m])
                r=m-1;
                else
                l=m+1;
            }
            else{
                if (n[m]<t && t<=n[r])
                l=m+1;
                else
                r=m-1;
            }
        }
    }
}
