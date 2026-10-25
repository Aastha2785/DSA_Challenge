import java.util.*;
public class redundant {
    static int[] redunt(int [][] mat){
        ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
        int r=mat.length;
        
        for(int i=0;i<=r;i++){
            ar.add(new ArrayList<>());
        }
        for(int ed[]:mat){
            int u=ed[0];
            int v=ed[1];
            boolean vsi[]=new boolean[r+1];
            if(dfs(ar,vsi,u,v))
                return ed;

            ar.get(u).add(v);
            ar.get(v).add(u);
        }
        return new int[0];
    }
    static boolean dfs(ArrayList<ArrayList<Integer>> ar, boolean []vsi,int cur,int tar){
        if(cur==tar)
            return true;
        vsi[cur]=true;
        for(int nei:ar.get(cur)){
            if(!vsi[nei]){
                if(dfs(ar,vsi,nei,tar))
                    return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int mat[][]={{1,2},{2,3},{3,4},{1,4}};
        int ed[]=redunt(mat);
        System.out.println(ed[0]+" "+ed[1]);

    }
}
