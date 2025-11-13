class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int []arr=new int[n];
        Arrays.fill(arr,-1);
        int stack[]=new int[n];
        int top=-1;
        for(int i=0;i<2*n;i++){
            while(top!=-1&&nums[i%n]>nums[stack[top]]){
                int prev=stack[top--];
                arr[prev]=nums[i%n];
            }
            if(i<n){
                stack[++top]=i%n;
            }
        }
        return arr;
    }
}