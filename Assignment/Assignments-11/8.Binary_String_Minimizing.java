import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();long k=sc.nextLong();
            char[] a=sc.next().toCharArray();
            int p=0;
            for(int i=0;i<n;i++){
                if(a[i]=='0'){
                    long d=i-p;
                    if(d<=k){
                        char x=a[p];
                        a[p]=a[i]
                        ;a[i]=x;
                        k-=d;
                        p++;
                    }
                    else{
                        int np=(int)(i-k);
                        a[i]='1';
                        a[np]='0';
                        break;
                    }
                }
            }
            System.out.println(new String(a));
        }
    }
}
