
import java.util.*;
public class bipartite {
    static boolean isBipart(int [][]mat){
        int r=mat.length;
        HashMap<Integer,Character> h=new HashMap<>();
        int x=0;
        for(int[] ed:mat){
            int l=ed.length;
            if(!h.containsKey(x)){
            h.put(x,'b');
            for(int i=0;i<l;i++){
                if(!h.containsKey(ed[i]))
                    h.put(ed[i],'p');
                else
                {
                    if(h.get(ed[i])=='b')
                        return false;
                }
            }
        }
        else{
            char c=h.get(x);
            char d=0;
            if(c=='p')
            {
                d='b';
            }
            else
                d='p';
            for(int i=0;i<l;i++){
                if(!h.containsKey(ed[i]))
                    h.put(ed[i],d);
                else{
                    if(h.get(ed[i])==c)
                        return false;
                }
            }
        }
        x++;
        }
        return true;
    }
    public static void main(String args[]){
        int mat[][]={{1,3},{0,2},{1,3},{0,2}};
        boolean b=isBipart(mat);
        System.out.println(b);
    }
}
