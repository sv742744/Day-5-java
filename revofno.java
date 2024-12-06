import java.util.*;
class revofno{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            int n=s.nextInt();
            int rev=0;
            int digit=0;
            while(n>0){
                digit=n%10;
                rev =rev*10+digit;
                n/=10;
            }
            System.out.println("reversed number is::"+rev);
        }
    }
}