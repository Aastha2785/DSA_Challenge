// 42. Trapping rain water
// used the concept of two pointers

public class two_point_42 {
    public static void main(String args[]){
        int h[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int r=h.length-1,l=0,rm=0,lm=0,w=0;
        while(l<r){
            if(h[l]<h[r]){
                lm=Math.max(lm,h[l]);
                w=w+lm-h[l];
                l++;
            }
            else{
                rm=Math.max(h[r],rm);
                w=w+rm-h[r];
                r--;
            }
        }
        System.out.println(w);
    }
}
