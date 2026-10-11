public class max_area_695 {
    static public int maxAreaOfIsland(int[][] grid) {
        int max=-1;
        int r=grid.length;
        int c=grid[0].length;
        int l=1;
        int x=-1;
        boolean vsi[][]=new boolean[grid.length][grid[0].length];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]!=0 && !vsi[i][j])
                x=dfs(grid,l,vsi,i,j);
            if(x>max)
                max=x;
            }
        }
        return max;
        
    }
    static int dfs(int gr[][],int l,boolean vsi[][],int a,int b){
        int r=gr.length;
        int c=gr[0].length;
        if(!vsi[a][b] && gr[a][b]==1){
            
            vsi[a][b]=true;
        }
        else
            return 0;
        
        if(a-1>=0 && gr[a-1][b]==1 && !vsi[a-1][b]){
            l=l+dfs(gr,l,vsi,a-1,b);
        }
        if(a+1<r && gr[a+1][b]==1 && !vsi[a+1][b]){
            l=l+dfs(gr,l,vsi,a+1,b);
        }
        if(b-1>=0 && gr[a][b-1]==1 && !vsi[a][b-1]){
            l=l+dfs(gr,l,vsi,a,b-1);
        }
        if(b+1<c && gr[a][b+1]==1 && !vsi[a][b+1]){
            l=l+dfs(gr,l,vsi,a,b+1);
        }
        return l;
    }
    public static void main(String args[]){
        int[][] grid = {
    {0, 1, 1, 0, 0},
    {0, 1, 1, 0, 1},
    {1, 0, 0, 0, 1},
    {0, 0, 1, 1, 1},
    {0, 0, 0, 0, 0}
};
int y=maxAreaOfIsland(grid);
System.out.println(y);
    }
}
