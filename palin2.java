import java.util.Scanner;
class palin2{
    static boolean ispalin(String a,int l,int r){
        while(l<r){
            char ch1=a.charAt(l);
            char ch2=a.charAt(r);
            if(ch1!=ch2){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=0,r=s.length()-1;
        boolean x=true;
        while(l<r){
            char ch1=s.charAt(l);
            char ch2=s.charAt(r);
            if(ch1!=ch2){
                x=ispalin(s,l+1,r)||ispalin(s,l,r-1);
            }
            l++;
            r--;
        }
        if(x){
            System.out.println("Yes it is palindrome");
        }
        else{
            System.out.println("No its not a palindrome");
        }
    }
}