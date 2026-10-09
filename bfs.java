import java.util.*;
public class bfs {
    static void nodes(ArrayList<ArrayList<Integer>> ar,int v,int u){
        ar.get(u).add(v);
        ar.get(v).add(u);
    }
    static void bfs(ArrayList<ArrayList<Integer>> ar,int v,int st){
        boolean vsi[]=new boolean[v];
        Queue<Integer> q=new LinkedList<>();
        vsi[st]=true;
        q.add(st);
        while(!q.isEmpty()){
            int n=q.poll();
            System.out.print(n+"->");
            for(int x:ar.get(n)){
                if(!vsi[x]){
                    vsi[x]=true;
                    q.add(x);
                }
            }

        }
    }
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
        for(int i=0;i<5;i++){
            ar.add(new ArrayList<>());
        }
        nodes(ar,0,1);
        nodes(ar,0,2);
        nodes(ar,1,3);
        nodes(ar,1,4);
        bfs(ar,5,0);
    }
}
