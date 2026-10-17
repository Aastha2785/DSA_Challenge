import java.util.*;
class surrounded_reg_130{
    static boolean[][] region(char st[][]){
        int r=st.length;
        int c=st[0].length;
        boolean vsi[][]=new boolean[r][c];
        int i=0;
        for(int j=0;j<c;j++){
            if(st[i][j]=='O'){
                dfs(st,vsi,i,j);
            }
        }
        i=r-1;
        for(int j=0;j<c;j++){
            if(st[i][j]=='O'){
                dfs(st,vsi,i,j);
            }
        }
        int j=0;
        for(i=0;i<r;i++){
            if(st[i][j]=='O'){
                dfs(st,vsi,i,j);
            }
        }
        j=c-1;
        for(i=0;i<r;i++){
            if(st[i][j]=='O'){
                dfs(st,vsi,i,j);
            }
        }
        return vsi;
    }
    static void dfs(char st[][],boolean vsi[][],int i,int j){
        int r=st.length;
        int c=st[0].length;
        vsi[i][j]=true;
        if(i+1<r && !vsi[i+1][j] && st[i+1][j]=='O'){
            dfs(st,vsi,i+1,j);
        }
        if(i-1>=0 && !vsi[i-1][j] && st[i-1][j]=='O'){
            dfs(st,vsi,i-1,j);
        }
        if(j+1<c && !vsi[i][j+1] && st[i][j+1]=='O'){
            dfs(st,vsi,i,j+1);
        }
        if(j-1>=0 && !vsi[i][j-1] && st[i][j-1]=='O'){
            dfs(st,vsi,i,j-1);
        }
    }
    public static void main(String args[]){
        char[][] b = {
    {'X', 'X', 'X', 'X', 'X', 'X'},
    {'X', 'O', 'O', 'X', 'O', 'X'},
    {'X', 'X', 'O', 'X', 'O', 'X'},
    {'O', 'O', 'X', 'O', 'X', 'X'},
    {'X', 'O', 'X', 'O', 'O', 'X'},
    {'X', 'X', 'X', 'X', 'O', 'X'}
};
boolean x[][]=region(b);
for(int i=0;i<x.length;i++){
    for(int j=0;j<x[0].length;j++){
        if(!x[i][j]){
            System.out.print('X'+" ");
        }
        else
            System.out.print('O'+" ");
        
    }
    System.out.println();
}
    }
}