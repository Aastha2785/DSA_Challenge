public class buy_sell_stockII {
    public static void main(String args[]){
        int ar[]={6,5,8,9,11,3,0};
        int t=ar[0];
        int tm=-1,s=0;
        for(int i=1;i<ar.length;i++){
            tm=ar[i];
            if(tm>t){
                s=s+tm-t;
            }
            t=tm;
        }
        System.out.println(s);
    }
}
