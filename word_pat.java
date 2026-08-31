import java.util.HashMap;
import java.util.StringTokenizer;

public class word_pat {
    public static void main(String args[]){
        String p="abba";
        String s="dog cat cat dog";
        HashMap<Character,String> pat=new HashMap<>();
        StringTokenizer st=new StringTokenizer(s);
        int n=st.countTokens();
        boolean pq=true;
        if(p.length()<n || p.length()>n){
        System.out.println("It is not matching the pattern");
        pq=false;
        }
        if(pq){
        for(int i=0;i<n;i++){
            char ch=p.charAt(i);
            String x=st.nextToken();
            if(!(pat.containsKey(ch))){
                for(String str:pat.values()){
                    if(str.equals(x))
                    pq= false;
                }
                pat.put(ch,x);
            }
            else{
                String y=pat.get(ch);
                if(!(y.equals(x)))
                pq=false;
            }
        }
    }
        if(pq){
            System.out.println("It is matching the pattern");
        
        }
        else
            System.out.println("It is not matching the pattern");
        
    }
}
