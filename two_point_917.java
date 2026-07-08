// 917. Reverse only letters
//  converted to array then exchanged the letters if both are letters

class two_point_917{
    public static void main(String args[]){
        String s="ab-cd-k";
        int r=s.length()-1,l=0;
        
        char ch[]=s.toCharArray();
        while(l<r){
            if(Character.isLetter(ch[l]) && Character.isLetter(ch[r])){
                char t=ch[l];
                ch[l]=ch[r];
                ch[r]=t;
                l++;
                r--;
            }
            else{
                if(!Character.isLetter(ch[l]))
                l++;
                else if(!Character.isLetter(ch[r]))
                r--;
            }

        }
        String re=new String(ch);
        System.out.println(re);
    }
}