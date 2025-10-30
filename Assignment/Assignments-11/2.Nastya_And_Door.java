import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            int[] peaks = new int[n];
            for(int i=1;i<n-1;i++){
                if(a[i]>a[i-1]&&a[i]>a[i + 1])
                    peaks[i] = 1;
            }
            int[] prefix=new int[n];
            prefix[0]=peaks[0];
            for (int i=1;i<n;i++){
                prefix[i]=prefix[i-1]+peaks[i];
            }
            int maxPeaks=-1;
            int bestStart=0;
            for (int i=0;i+k-1<n;i++) {
                int l =i+1;  
                int r=i+k-2;
                if(r >= n) break;
                int cnt=prefix[r]-prefix[l-1];
                if(cnt>maxPeaks) {
                    maxPeaks=cnt;
                    bestStart=i;
                }
            }
            System.out.println((maxPeaks+1)+" "+(bestStart+1));
        }

    }
}
