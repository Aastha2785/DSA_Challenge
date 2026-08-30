public class set_matrix_zero {
    public static void main(String args[]){
        int mat[][]={{1,2,3,0},{4,5,9,2},{7,0,9,1}};
        int m=mat.length;
        int n=mat[0].length;
        boolean r[]=new boolean[m];
        boolean c[]=new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        int x=0;
        while(x<m){
            for(int i=0;i<n;i++){
                if(mat[x][i]==0)
                {
                    r[x]=true;
                    break;
                }
            }
            x++;
        }
        x=0;
        while(x<n){
            for(int i=0;i<m;i++){
                if(mat[i][x]==0)
                {
                    c[x]=true;
                    break;
                }
            }
            x++;
        }
        
        for(int i=0;i<m;i++){
            if(r[i]){
                for(int k=0;k<n;k++){
                mat[i][k]=0;
                }
            }
        }
        
        
        for(int i=0;i<n;i++){
            if(c[i]){
                for(int k=0;k<m;k++){
                mat[k][i]=0;
                }
            }

        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
