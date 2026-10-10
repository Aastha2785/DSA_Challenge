import java.util.*;
public class province_547 {
    static public int findCircleNum(int[][] c) {
        boolean vsi[]=new boolean[c.length];
        int co=0;
        for(int j=0;j<c.length;j++){
            if(!vsi[j])
                co++;
            Queue<Integer> q=new LinkedList<>();
            q.add(j);
            vsi[j] = true;
        while(!q.isEmpty()){
            int x=q.poll();
            
            for(int i=0;i<c.length;i++){
                if(c[x][i]==1 && !vsi[i]){
                    vsi[i]=true;
                    q.add(i);
                }
            }
        }
    }
    return co;
    }
    public static void main(String args[]){
        int[][] c = {{1, 1, 0,0},{1, 1, 0,0},{0, 0, 1,0},{0,0,0,1}};
        int y=findCircleNum(c);
        System.out.println(y);
    }
}
