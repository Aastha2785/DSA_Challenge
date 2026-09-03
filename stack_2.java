import java.util.*;
public class stack_2 {
    public static void main(String args[]){
        String t[]={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<t.length;i++){
            if(!t[i].equals("+") && !t[i].equals("-") && !t[i].equals("*") && !t[i].equals("/")){
            int x=Integer.parseInt(t[i]);
            st.push(x);
            }
            else{
                int b=st.pop();
                int a=st.pop();
                if(t[i].equals("+")){
                    int c=a+b;
                    st.push(c);
                }
                else if(t[i].equals("-")){                   
                    int c=a-b;
                    st.push(c);
                }
                else if(t[i].equals("*")){
                    int c=a*b;
                    st.push(c);
                }
                else if(t[i].equals("/")){                    
                    int c=a/b;
                    st.push(c);
                }
            }
        }
        
        System.out.println(st.pop());
    }
}
