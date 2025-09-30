class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int ans=0;
        int c=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                c++;
            }
            while(c>k){
                if(nums[l]==0){
                    c--;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}