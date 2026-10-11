class perimeter_463{
    static public int islandPerimeter(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        boolean vsi[][]=new boolean[r][c];
        int l=0;
        int x= dfs(grid,vsi,l,0,1);
        return x;
    }
    static int dfs(int [][] gr,boolean vsi[][],int l,int a,int b){
        int r=gr.length;
        int c=gr[0].length;
        if(!vsi[a][b] && gr[a][b]!=0){
            vsi[a][b]=true;
        }
        else
            return 0;
        l=0;
        if (a - 1 < 0 || gr[a - 1][b] == 0) {
            l++;
        } else if (!vsi[a - 1][b]) {
            l += dfs(gr, vsi, l, a - 1, b);
        }

        if (a + 1 >= r || gr[a + 1][b] == 0) {
            l++;
        } else if (!vsi[a + 1][b]) {
            l += dfs(gr, vsi, l, a + 1, b);
        }

        if (b - 1 < 0 || gr[a][b - 1] == 0) {
            l++;
        } else if (!vsi[a][b - 1]) {
            l += dfs(gr, vsi, l, a, b - 1);
        }

        if (b + 1 >= c || gr[a][b + 1] == 0) {
            l++;
        } else if (!vsi[a][b + 1]) {
            l += dfs(gr, vsi, l, a, b + 1);
        }
        return l;
    }
    public static void main(String args[]){
        int[][] grid = {
    {0, 1, 0, 0},
    {1, 1, 1, 0},
    {0, 1, 0, 0},
    {1, 1, 0, 0}
};
int y=islandPerimeter(grid);
System.out.println(y);
    }
}