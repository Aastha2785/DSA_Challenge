import java.util.*;
public class miss_cann_bfs {
    static boolean safe(int m,int c){
        int cr=3-c;
        int mr=3-m;
        return m>=0 && m<=3 && c>=0 && c<=3 && (m==0 || m>=c) && (mr==0 || mr>=cr);
    }
    static void bfs(){
        Queue<int []> q=new LinkedList<>();
        Set<String> vsi=new HashSet<>();
        vsi.add("3,3,0");
        q.add(new int[]{3,3,0});
        int move[][]={{1,0},{0,1},{1,1},{2,0},{0,2}};
        while(!q.isEmpty()){
            int x[]=q.poll();
            int m=x[0],c=x[1],b=x[2];
            System.out.println(m+","+c+","+b);
            if(m==0 && c==0 && b==1){
                System.out.println("goal reached");
                break;
            }
            for(int mo[]:move){
                int mn=b==0?m-mo[0]:m+mo[0];
                int cn=b==0?c-mo[1]:c+mo[1];
                if(b==1){
                    if(3-m<mo[0] || 3-c<mo[1] )
                        continue;
                }
                else{
                    if(m<mo[0] || c<mo[1])
                        continue;
                }
                int nb=1-b;
                String key=mn+","+cn+","+nb;
                if(!vsi.contains(key) && safe(mn,cn)){
                    vsi.add(key);
                    q.add(new int[]{mn,cn,nb});
                }

            }
        }


    }
    public static void main(String args[]){
        bfs();
    }
}
