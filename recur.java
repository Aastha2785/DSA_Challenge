// not a leetcode problem just adding the element of array through recursion
class recur{
    static int sum(int ar[],int x){
        if(x==1)
            return ar[0];
        return ar[x-1]+sum(ar,x-1);
    }
    public static void main(String args[]){
        int ar[]={1,2,3,1,4,2};
        int y=sum(ar,ar.length);
        System.out.println(y);

    }
}