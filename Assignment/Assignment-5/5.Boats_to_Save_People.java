import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] w, int limit) {
        Arrays.sort(w);
        int i=0,j=w.length-1,boats=0;
        while(i<=j){
            if(w[i]+w[j]<=limit)i++;
            j--;
            boats++;
        }
        return boats;
    }
}