import java.util.*;
public class spiral_mat {
    public static void main(String args[]){
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}}; 
        List<Integer> ar=new ArrayList<>();
        int top=0,btm=mat.length-1,le=0,ri=mat[0].length-1;
        while(top<=btm && le<=ri){
            for(int i=le;i<=ri;i++){
                ar.add(mat[top][i]);
            }
            top++;
        for(int i=top;i<=btm;i++){
            ar.add(mat[i][ri]);
        }
        ri--;
        if(top<=btm){
            for(int i=ri;i>=le;i--){
                ar.add(mat[btm][i]);
            }
            btm--;
        }
        if(le<=ri){
            for(int i=btm;i>=top;i--){
                ar.add(mat[i][le]);
            }
        }
        le++;
        }
        System.out.println(ar);
    }
}
