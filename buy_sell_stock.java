public class buy_sell_stock {
    public static void main(String args[]){
        int ar[]={7,1,2,5,3,8,4};
        int mx=0;
        int x=Integer.MAX_VALUE;
        for(int i:ar){
            if(i<x){
                x=i;
            }
            else{
                mx=Math.max(mx,i-x);
            }
        }
        System.err.println(mx);
        
    }
}
