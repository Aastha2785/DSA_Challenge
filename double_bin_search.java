//  constraint was ti attain O(logn) complexity

import java.util.Scanner;
class double_bin_search{
    static int lef(int nums[],int t){
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == t) {
                ans = m;
                r = m - 1;
            }
            else if (nums[m] < t) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        return ans;
    }
    static int righ(int nums[],int t){
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == t) {
                ans = m;
                l = m+1;
            }
            else if (nums[m] < t) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        return ans;
    }
public static void main(String args[]){
int ar[]={2,2,3,4,5,5,5,5,6,7,7,8,8,9};
int t=5;
int x=lef(ar,t);
int y=righ(ar,t);
System.out.println("Starting index= "+x+", Ending index = "+y);

}
}