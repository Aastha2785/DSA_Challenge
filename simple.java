import java.util.Scanner;
class simple{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        System.out.println("Enter elements of array");
        for(int i=0;i<5;i++){
            ar[i]=sc.nextInt();
        }
        int re=ar[0];
        for(int i=1;i<5;i++){
            re=re^ar[i];
        }
        System.out.println(re);
    }
}