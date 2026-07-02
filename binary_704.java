// 704. Binary Search

class binary_704{
    public static void main(String rgs[]){
        int n[]={-1,0,3,5,9,12};
        int t=9;
        int l=0,r=n.length;
        for(int i=0;i<n.length;i++){
            int m=(l+r)/2;
            if(n[m]<t)
            l=m;
            else if(n[m]>t)
            r=m;
            else
            {
                System.out.println(m);
                break;
            }
        }
        
    }
}