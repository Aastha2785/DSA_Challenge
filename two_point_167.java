public class two_point_167 {
    public static void main(String args[]){
        int n[]={2,7,8,11,15};
        int t=15;
        int r=n.length-1,l=0;
        int ar[]=new int[2];
        while(l<r){
            if((n[l]+n[r])>t){
                r--;
            }
            else if((n[l]+n[r])<t)
                l++;
            else{
            ar[0]=l;
            ar[1]=r;
            break;
        }
        }
        System.out.println("["+ar[0]+","+ar[1]+"]");
    }
}
