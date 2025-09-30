class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left=0;
        int right=0;
        int max=0;

        while(right<s.length()) {
            char c=s.charAt(right);

            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;                
            }

            max=Math.max(max, right-left+1);

            set.add(s.charAt(right));
            right++;
        }

        return max;
    }
}