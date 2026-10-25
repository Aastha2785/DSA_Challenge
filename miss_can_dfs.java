import java.util.*;
public class miss_can_dfs {
    static Set<String> vsi=new HashSet<>();
    static boolean safe(int m,int c){
        int mr=3-m;
        int cr=3-c;
        return m>=0 && m<=3 && c>=0 && c<=3 && (m==0 || m>=c) && (mr==0 || mr>=cr);
    }
    static boolean dfs(int m,int c,int b){
        String key=m+","+c+","+b;
        if(!safe(m,c) || vsi.contains(key))
            return false;

        vsi.add(key);
        System.out.println(key);
        if(m==0 && c==0 && b==1)
        {
            System.out.println("reached");
            return true;
        }
        int move[][]={{0,1},{1,0},{1,1},{2,0},{0,2}};
        for(int mo[]:move){
            int mn=b==0?m-mo[0]:m+mo[0];
            int nc=b==0?c-mo[1]:c+mo[1];
            if(b==1){
                if(3-m<mo[0] || 3-c<mo[1])
                    continue;
            }
            else{
                if(m<mo[0] || c<mo[1])
                    continue;
            }
            if(dfs(mn,nc,1-b))
                return true;
        }
        return false;
    }
    public static void main(String args[]){
        dfs(3,3,0);
    }
}
