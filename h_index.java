class h_index{
    public static void main(String args[]){
        int ci[]={3,2,0,6,7};
        int mx=0;
        boolean bol=true;
        int k=0;
        while(bol){
        for(int i=0;i<ci.length;i++){
            if(k<=ci[i])
            mx++;
        }
        if(mx<k)
        {
            bol=false;
        }
        k++;
        mx=0;
        }
        System.out.println(k-2);
    }
}