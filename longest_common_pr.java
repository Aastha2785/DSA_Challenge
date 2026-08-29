public class longest_common_pr {
    public static void main(String args[]){
        String s[]={"flower","flow","flight"};
        String x="",y="";
    int l=Integer.MAX_VALUE;
    for(int i=0;i<s.length;i++){
        if(l>s[i].length()){
        l=s[i].length();
        y=s[i];
        }
    }
    boolean b=true;
    for(int i=0;i<l;i++){
        char ch=y.charAt(i);
        for(int j=0;j<s.length;j++){
            if(ch!=s[j].charAt(i))
            b=false;
        }
        if(b)
        x=x+ch;
        else
        break;
    }
    System.out.println(x);
    }
}
