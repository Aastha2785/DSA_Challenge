import java.util.*;
public class insert_int {
    public static void main(String args[]){
        int it[][]={{1,2},{3,5},{6,7},{8,10},{12,16}};
        int nit[]={4,8};
        List<int[]> ans=new ArrayList<>();
        int st=nit[0];
        int end=nit[1];
        for(int i=0;i<it.length;i++){
            if(st>it[i][1]){
                ans.add(it[i]);
            }
            else if(end<it[i][0]){
                ans.add(new int[]{st,end});
                for(int j=i;j<it.length;j++){
                    ans.add(it[j]);
                }
                break;
            }
            else{
                st=Math.min(st,it[i][0]);
                end=Math.max(end,it[i][1]);
            }
        }
        for(int x[]:ans){
            System.out.println(x[0]+" "+x[1]);
        }
    }
}
