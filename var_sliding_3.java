// 3. Longest Substring Without Repeating Characters
// created a hashset 
// if the character is already present in the hashset then it will remove the character from the beginning and add the new one

import java.util.*;
public class var_sliding_3 {
    public static void main(String args[]){
        String s="abcabcbbacd";
        int x=0,si=0,mx=0;
        HashSet<Character> h=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(h.contains(ch)){
                h.remove(s.charAt(x));
                si--;
                x++;
            }
            h.add(ch);
            si++;
            if(si>mx)
                mx=si;
        }
        System.out.println(mx);
    }
}
