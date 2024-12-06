import java.util.*;
class pallindrom{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            int n=s.nextInt();
            int temp=n;
            int rev=0;
            int digit=0;
            while(n>0){
                digit=n%10;
                rev =rev*10+digit;
                n/=10;
            }
            if(temp==rev){
                System.out.println("number is palindrom ::"+rev);
            }
            else{
                System.out.println("number is not a palindrom ::"+rev);
            }

        }
            
    }
}