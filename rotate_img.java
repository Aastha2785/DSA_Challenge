public class rotate_img {
    public static void main(String args[]){
    int mat[][]={{1,2,3},{4,5,6},{7,8,9}}; 
    int ar[][]=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                ar[i][j]=mat[i][j];
            }
        }
        
        for(int i=0;i<mat.length;i++){
            int x=mat.length-1;
            for(int j=0;j<mat.length;j++){
                mat[i][j]=ar[x][i];
                x--;
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
