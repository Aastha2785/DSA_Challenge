// 11. Container with most water
// used the concept of two pointers
// there are two pointers l and r we have to move any one which is lesser than the other

import java.util.*;
public class two_point_11 {
    public static void main(String args[]){
    int h[]={1,8,6,2,5,4,8,3,7};
    int mx=0;
    int l=0,r=h.length-1;
    while(l<r){
        int ar=(r-l)*((int)Math.min(h[r],h[l]));
        if(mx<ar)
            mx=ar;
        if(h[r]<h[l])
            r--;
        else
            l++;
    }
    System.out.println(mx);
    }
}
