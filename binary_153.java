// 153. Find minimum in rotated sorted array
// if a array is in ascending order and is rotated then the array is divided into 2 sorted subarray 
public class binary_153 {
    public static void main(String args[]){
        int ar[]={3,4,5,1,2};
        int r=ar.length-1,l=0;
        while(l<=r){
            int m=(l+r)/2;
            if(ar[m]>ar[r])
                l=m+1;
            else if(ar[m]<ar[r])
                r=m;
            else 
                r--;

        }
        System.out.println(ar[l]);
    }
    
}
