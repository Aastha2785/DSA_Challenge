class gas_station{
    public static void main(String args[]){
        int gas[]={1,2,3,4,5};
        int cost[]={3,4,5,1,2};
        int t=0,tot=0,s=0;
        for(int i=0;i<gas.length;i++){
            t=t+gas[i]-cost[i];
            tot=tot+gas[i]-cost[i];
            if(t<0){
                s=i+1;
                t=0;
            }
        }
        if(tot<0)
            System.out.println(-1);
        else{
            System.out.println(s);
        }
    }
}