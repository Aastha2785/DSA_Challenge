import java.util.StringTokenizer;

public class Reverse_words {
    public static void main(String args[]){
    String s = " the sky is blue  ";
    s=s.trim();
        String x="";
        StringTokenizer st=new StringTokenizer(s);
        int n=st.countTokens();
        for(int i=0;i<n;i++){
            String a=st.nextToken();
            x=a+" "+x;
        }
        System.out.println(x.trim());
}
}
