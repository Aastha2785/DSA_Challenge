public class floyd{
    public static void main(String args[]){
        int ar[]={2,4,1,3,1};
        int s=ar[0];
        int f=ar[0];
        do{
            s=ar[s];
            f=ar[ar[f]];
        }while(s!=f);
        s=ar[0];
        while(s!=f){
            s=ar[s];
            f=ar[f];
        }
        System.out.println(s);
    }
}