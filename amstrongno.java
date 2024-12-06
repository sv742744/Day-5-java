import java.util.*;
class amstrongno{
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
                rev =rev+digit*digit*digit;
                n/=10;
            }
            if(temp==rev){
                System.out.println("number is amstong number ::"+rev);
            }
            else{
                System.out.println("number is not a amstong number : ::"+rev);
            }

        }
            
    }
}