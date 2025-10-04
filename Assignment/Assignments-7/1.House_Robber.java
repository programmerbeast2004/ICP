class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];

        int dp[] =new int[n+1];
        dp[0]=0;
        dp[1]=nums[0];
        for(int k=2;k<=n;k++){
            dp[k]=Math.max(dp[k-2]+nums[k-1],dp[k-1]);
        }
        return dp[n];
    }
}