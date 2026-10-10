import java.util.*;
public class islands_200 {
    static public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int co=0;
        boolean vsi[][]=new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(!vsi[i][j] && grid[i][j]=='1'){
                    co++;
                vsi[i][j]=true;
                Queue<int[]> q=new LinkedList<>();
                q.add(new int[]{i,j});
                while(!q.isEmpty()){
                    int cell[]=q.poll();
                    int a=cell[0];
                    int b=cell[1];
                    if(a-1>=0 && grid[a-1][b]=='1' && !vsi[a - 1][b]){
                        vsi[a-1][b]=true;
                        q.add(new int[]{a-1,b});
                    }
                    if(b-1>=0 && grid[a][b-1]=='1' && !vsi[a ][b-1]){
                        vsi[a][b-1]=true;
                        q.add(new int[]{a,b-1});
                    }
                    if(a+1<r && grid[a+1][b]=='1' && !vsi[a+1][b]){
                        vsi[a+1][b]=true;
                        q.add(new int[]{a+1,b});
                    }
                    if(b+1<c && grid[a][b+1]=='1' && !vsi[a][b+1]){
                        vsi[a][b+1]=true;
                        q.add(new int[]{a,b+1});
                    }
                }
            }
        }
            
        }
        return co;
    }
    public static void main(String args[]){
    char[][] grid = {{'1', '1', '0', '0', '0'},{'1', '1', '0', '0', '0'},{'0', '0', '1', '0', '0'},{'0', '0', '0', '1', '1'}};
    System.out.println(numIslands(grid));
    }
}
