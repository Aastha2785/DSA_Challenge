// 35. Search Insert Position
// used the concept of binry search

public class binary_35 {
public static void main(String args[]){
    int n[]={1,3,5,6};
    int t=6;
    int l=0,r=n.length-1;
        while(l<=r){
            int m=(l+r)/2;
            if(n[m]<t){
            l=m+1;
            }
            else if(n[m]>t){
            r=m-1;
            }
            else{
                System.out.println(m);
            break;
            }
            
        }
        System.out.println(l);
}
}