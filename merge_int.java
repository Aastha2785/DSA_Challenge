import java.util.*;
public class merge_int {
    public static void main(String args[]){
        int it[][]={{1,3},{2,6},{8,10},{9,18}};
        Arrays.sort(it,(a,b)->a[0]-b[0]);
        List<int[]> ans=new ArrayList<>();
        int st=it[0][0];
        int end=it[0][1];
        for(int i=0;i<it.length;i++){
            if(it[i][0]<=end){
                end=Math.max(it[i][1],end);
            }
            else{
                ans.add(new int[]{st,end});
                st=it[i][0];
                end=it[i][1];
            }
        }
        ans.add(new int[]{st,end});
        for(int x[]:ans){
            System.out.println(x[0]+" "+x[1]);
        }

    }
}
