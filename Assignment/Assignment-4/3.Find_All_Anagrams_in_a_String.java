import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p){
        List<Integer> res = new ArrayList<>();
        if(s.length()<p.length()) return res;
        int[] pc = new int[26];
        int[] sc = new int[26];
        int w = p.length();
        for (char c : p.toCharArray()) pc[c -'a']++;
        for(int i=0;i<s.length();i++){
            sc[s.charAt(i)-'a']++;
            if(i>=w) sc[s.charAt(i-w)-'a']--;
            if(Arrays.equals(pc,sc)) res.add(i-w+1);
        }
        return res;
    }
}