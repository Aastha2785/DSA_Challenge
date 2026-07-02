// 424. Longest Repeating Character Replacement
// used the concept of sliding window where l and i are used to track the String and count number of repeating characters
public class var_sliding_424 {
    public static void main(String args[]){
        String s="AABCAABB";
        int k=3;
        int ar[]=new int[26];
        int mx=0,l=0,ml=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            ar[ch-'A']++;
            mx=Math.max(ar[ch-'A'],mx);
            while ((i-l+1)-mx>k) {
                ar[s.charAt(l)-'A']--;
                l++;
            }
            ml=Math.max(ml,i-l+1);
        }
        System.out.println(ml);
    }
}
