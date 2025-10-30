import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong(),b=sc.nextLong();
        List<Long> seq=new ArrayList<>();
        seq.add(b);
        while(b>a){
            if(b%2==0)b/=2;
            else if(b%10==1)b/=10;
            else break;
            seq.add(b);
        }
        if(b==a){
            System.out.println("YES");
            System.out.println(seq.size());
            for(int i=seq.size()-1;i>=0;i--){
                System.out.print(seq.get(i)+" ");
            }    
        }
        else System.out.println("NO");
    }
}
