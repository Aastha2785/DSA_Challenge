// 27. Remove Elements
public class easy {
    public static void main(String args[]){
        int ar[]={2,1,4,6,2,8,2};
        int k=2;
        int x=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]!=k){
                int t=ar[x];
                ar[x]=ar[i];
                ar[i]=t;
                x++;
            }
        }
        for(int i=0;i<x;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
