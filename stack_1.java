import java.util.*;
class stack_1{
    public static void main(String args[]){
        String s="/home//foo/";
        String ar[]=s.split("/");
        Stack<String> st=new Stack<>();
        for(int i=1;i<ar.length;i++){
            String str=ar[i];
            if(!st.isEmpty() && str.equals("..")){
                st.pop();
            }
            else if(str.equals(".") || str.equals("") || str.equals("..")){
                continue;

            }
            else{
                st.push(str);
            }
        }
        if(st.isEmpty())
        System.out.println("/");
        String nw="";
        while(!(st.isEmpty())){
            String str=st.pop();
            nw="/"+str+nw;
        }
        if(nw.charAt(1)=='/')
        System.out.println( nw.substring(1));
        else
        System.out.println(nw);
    }
}