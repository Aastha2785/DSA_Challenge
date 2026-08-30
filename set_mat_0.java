public class set_mat_0 {
    public static void main(String args[]){
        int mat[][]={{1,2,3,0},{4,5,9,2},{7,0,9,1}};
        int ar[][]=new int[mat.length][mat[0].length];
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ar[i][j]=mat[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(ar[i][j]==0){
                    for(int x=0;x<m;x++){
                        mat[x][j]=0;
                    }
                    for(int y=0;y<n;y++){
                        mat[i][y]=0;
                    }
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
