import java.util.*;
public class weight_grph {
    static void values(Map<String,Map<String,Integer>> gr,String a,String b,int c){
        gr.get(a).put(b,c);
    }
    static void dfs(Map<String,Map<String,Integer>> gr, String s,String d,int dis){
        if(s.equals(d)){
            System.out.println("Distance ="+dis);
            return;
        }
        for(Map.Entry<String,Integer> e:gr.get(s).entrySet()){
            String nx=e.getKey();
            int wei=e.getValue();
            dfs(gr,nx,d,dis+wei);

        }
    }
    public static void main(String args[]){
        Map<String,Map<String,Integer>> gr=new HashMap<>();
        gr.put("A",new HashMap<>());
        gr.put("B",new HashMap<>());
        gr.put("C",new HashMap<>());
        gr.put("D",new HashMap<>());
        gr.put("E",new HashMap<>());

        values(gr,"A","B",10);
        values(gr,"A","C",3);
        values(gr,"B","E",4);
        values(gr,"C","B",2);
        // values(gr,"D","C",4);
        values(gr,"E","D",7);
        // values(gr,"E","A",8);
        values(gr,"D","B",10);
        for(String s:gr.keySet()){
            System.out.println(s+"->"+gr.get(s));
        }
        dfs(gr,"A","D",0);
    }
}
