import java.util.*;
public class Main{
    static int maxLength(String s, int k, char targetChar){
        int left=0, changes=0, best=0;
        for(int right=0;right<s.length();right++){
            if(s.charAt(right) != targetChar) changes++;
            while(changes>k){
                if(s.charAt(left)!=targetChar) changes--;
                left++;
            }
            best = Math.max(best,right-left+1);
        }
        return best;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        String s = sc.next();
        int res = Math.max(maxLength(s,k,'a'), maxLength(s,k,'b'));
        System.out.println(res);
    }
}
