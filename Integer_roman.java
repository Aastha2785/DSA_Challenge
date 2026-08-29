public class Integer_roman {
    public static void main(String args[]){
        int num=4562;
        String s="";
        while(true){
            if(num-1000>=0)
            {
                s=s+'M';
                num=num-1000;
            }
            else if(num-900>=0)
            {
                s=s+"CM";
                num=num-900;
            }
            else if(num-500>=0)
            {
                s=s+'D';
                num=num-500;
            }
            else if(num-400>=0)
            {
                s=s+"CD";
                num=num-400;
            }
            else if(num-100>=0){
                s=s+'C';
                num=num-100;
            }
            else if(num-90>=0)
            {
                s=s+"XC";
                num=num-90;
            }
            else if(num-50>=0){
                s=s+"L";
                num=num-50;
            }
            else if(num-40>=0){
                s=s+"XL";
                num=num-40;
            }
            else if(num-10>=0)
            {
                s=s+'X';
                num=num-10;
            }
            else if(num-9>=0)
            {
                s=s+"IX";
                num=num-9;
            }
            else if(num-5>=0)
            {
                s=s+'V';
                num=num-5;
            }
            else if(num-4>=0)
            {
                s=s+"IV";
                num=num-4;
            }
            else if(num-1>=0)
            {
                s=s+'I';
                num=num-1;
            }
            else break;
        }
        System.out.println(s);
    }
}
