public class sort_colors {
    public static void main(String args[]){
    int ar[]={2,2,0,1,1,0,0};
    int l=0,m=0,r=0;
    for(int i=0;i<ar.length;i++){
        if(ar[i]==0)
            l++;
        else if(ar[i]==1)
            m++;
        else
            r++;
    }
    int x=0;
    while(l!=0){
        ar[x]=0;
        x++;
        l--;
    }
    while(m!=0){
        ar[x]=1;
        x++;
        m--;
    }
    while(r!=0){
        ar[x]=2;
        x++;
        r--;
    }
    for(int i=0;i<ar.length;i++){
        System.out.println(ar[i]);

    }
    }
}
