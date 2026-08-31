import java.util.*;
class happy{
    public static void main(String args[]){
        
        int n=19;
        HashSet<Integer> set=new HashSet<>();
        int sum=n;
        int x=0;
        while(n!=1){
            if(set.contains(n))
            break;
            set.add(n);
            while(n!=0)
            {
                int r=n%10;
                x=x+r*r;
                n=n/10;
            }
            sum=x;
            n=x;
            x=0;
        }
        if(sum==1)
        System.out.println("Yes it is");
        else
        System.out.println("No its not");
    }
}