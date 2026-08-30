import java.util.HashSet;
public class sudoko {
    public static void main(String args[]){
        char[][] b = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        boolean bol=true;
        HashSet<Character> []row=new HashSet[9];
        HashSet<Character> []col=new HashSet[9];
        HashSet<Character> []box=new HashSet[9];
    
        for(int i=0;i<9;i++){
        row[i]=new HashSet<>();
        col[i]=new HashSet<>();
        box[i]=new HashSet<>();
        }
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                char val=b[r][c];
                if(val=='.')
                    continue;
                int bi=(r/3)*3+(c/3);
                if(row[r].contains(val) || col[c].contains(val) || box[bi].contains(val)){
                    bol=false;
                }
                row[r].add(val);
                col[c].add(val);
                box[bi].add(val);
        }
        }
        if(bol)
            System.out.println("yes this sudoku is correct");
        else 
            System.out.println("this sudoku is wrong");
    }
}
