import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> ct = new Stack<>();
        Stack<String> st = new Stack<>();
        String curr = "";
        int currt = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currt = currt * 10 + (c - '0');
            } else if (c == '[') {
                ct.push(currt);
                st.push(curr);
                currt = 0;
                curr = "";
            } else if (c == ']') {
                int rt = ct.pop();
                StringBuilder temp = new StringBuilder(st.pop());
                temp.append(curr.repeat(rt));
                curr = temp.toString();
            } else {
                curr += c;
            }
        }
        return curr;
    }
}