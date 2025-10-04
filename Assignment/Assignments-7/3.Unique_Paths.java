class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int arr[]: dp){
            Arrays.fill(arr,-1);
        }
        return helper(0,0,m,n,dp);
    }
    public int helper(int i,int j,int m,int n, int[][] dp){
        if(i>=m || j>=n) return 0; //out of bound case
        if(i==m-1 ||j==n-1) return 1; // reached
        if(dp[i][j] !=-1)return dp[i][j]; // check for already memo wala

        int right=helper(i,j+1,m,n,dp); // right ki call
        int down=helper(i+1,j,m,n,dp); // left ki call

        return dp[i][j]=right+down;
    }
}