// 1423. Maximum Points You Can Obtain from Cards
// used the concept of sliding window
// first find the sum of first k elements then remove lat of 1st k elements and add the elements from the last of the array

import java.util.Scanner;
class sliding_1423{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int c[]={1,2,3,4,5,6,1};
        int k=3;
        int s=0,max=0,n=c.length;
        for(int i=0;i<k;i++){
            s=s+c[i];
            if(max<s)
            max=s;
        }
        int x=1,y=k-1;
        for(int j=k;x<=k;j++){
            s=s+c[n-x]-c[y];
            x++;
            y--;
            if(max<s)
            max=s;
        }
        System.out.println(max);

    }
}