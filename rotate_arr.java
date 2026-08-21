public class rotate_arr {
    static void rev(int ar[],int s,int r){
        while(s<r){
            int t=ar[s];
            ar[s]=ar[r];
            ar[r]=t;
            s++;
            r--;
        }
        
    }
    public static void main(String args[]){
        int ar[]={1,4,2,3,5,6,8};
        int k=3;
        rev(ar,0,ar.length-1);
        rev(ar,0,k-1);
        rev(ar,k,ar.length-1);

        for(int i:ar){
            System.out.println(i);
        }
    }
}
