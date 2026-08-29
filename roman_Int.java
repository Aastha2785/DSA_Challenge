public class roman_Int {
    public static void main(String args[]){
        String s="MCIX";
        int a=0,b=0,x=0;
        for(int i=0;i<s.length()-1;i++){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            if(ch1=='I')
            a=1;
            else if(ch1=='V')
            a=5;
            else if(ch1=='X')
            a=10;
            else if(ch1=='L')
            a=50;
            else if(ch1=='C')
            a=100;
            else if(ch1=='D')
            a=500;
            else
            a=1000;
            if(ch2=='I')
            b=1;
            else if(ch2=='V')
            b=5;
            else if(ch2=='X')
            b=10;
            else if(ch2=='L')
            b=50;
            else if(ch2=='C')
            b=100;
            else if(ch2=='D')
            b=500;
            else
            b=1000;
        if(a>=b)
            x=x+a;
            else
            x=x-a;
        }
        char ch1=s.charAt(s.length()-1);
        if(ch1=='I')
            a=1;
            else if(ch1=='V')
            a=5;
            else if(ch1=='X')
            a=10;
            else if(ch1=='L')
            a=50;
            else if(ch1=='C')
            a=100;
            else if(ch1=='D')
            a=500;
            else
            a=1000;
        x=x+a;
        System.out.println(x);
    }
}
