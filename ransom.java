import java.util.HashMap;

public class ransom {
    public static void main(String args[]){
        String r="aabc",m="abcde";
        boolean pq=true;
        HashMap<Character,Integer> ran=new HashMap<>();
        HashMap<Character,Integer> mag=new HashMap<>();
        for(int i=0;i<r.length();i++){
            char ch=r.charAt(i);
            ran.put(ch,ran.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<m.length();i++){
            char ch=m.charAt(i);
            mag.put(ch,mag.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<r.length();i++){
            char x=r.charAt(i);
            int l1=ran.get(x);
            if(mag.containsKey(x)){
                int l2=mag.get(x);
                if(l1>l2)
            pq= false;
            }
            else
            pq= false;
        }
        System.out.println(pq);

    }
}
