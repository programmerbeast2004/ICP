import java.util.*;
public class Main{
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                while(t-->0){
                        int n=sc.nextInt();
                        int a=sc.nextInt();
                        int b=sc.nextInt();
                        int c=sc.nextInt();
                        int d=sc.nextInt();
                        
                        int minT=n*(a-b);
                        int maxT=n*(a+b);
                        
                        int minA=c-d;
                        int maxA=c+d;
                        
                        if(maxT<minA || maxA<minT){
                                System.out.println("NO");
                        }
                        else{
                                System.out.println("YES");
                        }
                }
        }
}