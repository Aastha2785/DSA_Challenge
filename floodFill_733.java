public class floodFill_733 {
    static public int[][] floodFill(int[][] im, int sr, int sc, int co) {
        int r=im.length;
        int c=im[0].length;
        boolean vsi[][]=new boolean[r][c];
        return dfs(im,sr,sc,co,vsi);
        

    }
    static int[][] dfs(int[][] im, int sr, int sc, int co,boolean [][]vsi){
        int r=im.length;
        int c=im[0].length;
        vsi[sr][sc]=true;
        if(im[sr][sc]!=0)
        im[sr][sc]=co;
        if(sr-1>=0 && !vsi[sr-1][sc]&& im[sr-1][sc]!=co){
            dfs(im,sr-1,sc,co,vsi);
        }
        if(sr+1<r && !vsi[sr+1][sc] && im[sr+1][sc]!=co){
            dfs(im,sr+1,sc,co,vsi);
        }
        if(sc-1>=0 && !vsi[sr][sc-1]&& im[sr][sc-1]!=co){
            dfs(im,sr,sc-1,co,vsi);
        }
        if(sc+1<c && !vsi[sr][sc+1]&& im[sr][sc+1]!=co){
            dfs(im,sr,sc+1,co,vsi);
        }
        return im;

    }
    public static void main(String args[]){
        int[][] im = {
    {0, 0, 0, 0},
    {0, 0, 0, 0}
};
int ar[][]=floodFill(im,1,0,3);

for(int i=0;i<im.length;i++){
    for(int j=0;j<im[0].length;j++){
        System.out.print(ar[i][j]+" ");
    }
    System.out.println();
}
    }
}
