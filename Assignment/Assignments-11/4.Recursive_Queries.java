import java.util.*;
public class Main{
    static int[] f=new int[1000001];
    static int[][] pre=new int[10][1000001];
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        precompute();
        int q=sc.nextInt();
        while(q-->0){
            int l=sc.nextInt(),r=sc.nextInt(),k=sc.nextInt();
            System.out.println(pre[k][r]-pre[k][l-1]);
        }
    }
    static void precompute(){
        for(int i=1;i<=1000000;i++){
            f[i]=calc(i);
            for(int k=1;k<=9;k++)pre[k][i]=pre[k][i-1]+(f[i]==k?1:0);
        }
    }
    static int calc(int x){
        if(x<10)return x;
        int p=1;
        while(x>0){
            int d=x%10;
            if(d!=0)p*=d;
            x/=10;
        }
        return calc(p);
    }
}