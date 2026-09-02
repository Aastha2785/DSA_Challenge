import java.util.Arrays;

public class arrow_burst {
    public static void main(String args[]){
        int p[][]={{10,16},{2,8},{1,6},{7,12}};
        Arrays.sort(p, (a, b) -> Integer.compare(a[1], b[1]));

        int x=1;
        int l=p[0][1];
        for(int i=1;i<p.length;i++){
            int st=p[i][0];
            int end=p[i][1];
            if(st<=l && end>=l)
            continue;
            else
            {
                x++;
                l=end;
            }
        }
        System.out.println(x);
    }
}
