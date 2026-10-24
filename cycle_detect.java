public class cycle_detect {
    static boolean dfs(int ed[][],boolean vsi[],int c,int p){
        if(!vsi[c]){
            vsi[c]=true;
            for(int n:ed[c]){
                if(!vsi[n]){
                    if(dfs(ed,vsi,n,c))
                        return true;
                }
                else{
                    if(n!=p)
                        return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        // int[][] ed = {{1, 2},{1, 3},{2, 3}};
         int[][] ed = {
            {1, 2}, // 0
            {0, 3, 4}, // 1
            {0, 5}, // 2
            {1}, // 3
            {1}, // 4
            {2}  // 5
        };
boolean vsi[]=new boolean[6];


        boolean x=dfs(ed,vsi,0,-1);
        System.out.println(x);
    }
}
