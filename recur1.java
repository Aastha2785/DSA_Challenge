// not a leetcode problem just reversing the string through recursion

public class recur1 {
    static String rev(String s,int l){
        if(l==0)
            return "";
        return s.charAt(l-1)+rev(s,l-1);
    }
    public static void main(String args[]){
        String s="adviku";
        String x=rev(s,s.length());
        System.out.println(x);

    }
}
