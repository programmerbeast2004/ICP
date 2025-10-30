import java.util.*;
public class Main{
    static double fact(int n){
        double f=1;
        for(int i=2;i<=n;i++)f*=i;
        return f;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next(),s2=sc.next();
        int p1=0,p2=0,q=0;
        for(char c:s1.toCharArray())p1+=(c=='+')?1:-1;
        for(char c:s2.toCharArray()){
            if(c=='+')p2++;
            else if(c=='-')p2--;
            else q++;
        }
        int diff=p1-p2;
        if((diff+q)%2!=0||Math.abs(diff)>q){
            System.out.println("0.000000000000");
            return;
        }
        int x=(diff+q)/2;
        double ways=fact(q)/(fact(x)*fact(q-x));
        double prob=ways/Math.pow(2,q);
        System.out.printf("%.12f\n",prob);
        sc.close();
    }
}
