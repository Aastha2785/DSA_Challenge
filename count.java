import java.util.*;
public class count {
    static void nodes(ArrayList<ArrayList<Integer>> ar,int v,int u){
        ar.get(u).add(v);
        ar.get(v).add(u);
    }
    static void bfs(ArrayList<ArrayList<Integer>> ar,int v,int st){
        boolean vsi[]=new boolean[v];
        Queue<Integer> q=new LinkedList<>();
        vsi[st]=true;
        int c=0;
        q.add(st);
        while(!q.isEmpty()){
            int n=q.poll();
            c++;
            for(int x:ar.get(n)){
                if(!vsi[x]){
                    vsi[x]=true;
                    q.add(x);
                }
            }

        }
        System.out.println("no. of nodes = "+c);
    }
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
        for(int i=0;i<9;i++){
            ar.add(new ArrayList<>());
        }
        nodes(ar,0,1);
        nodes(ar,0,2);
        nodes(ar,1,3);
        nodes(ar,1,4);
        nodes(ar,8,5);
        nodes(ar,8,6);
        nodes(ar,6,7);
        bfs(ar,9,8);
    }
}

