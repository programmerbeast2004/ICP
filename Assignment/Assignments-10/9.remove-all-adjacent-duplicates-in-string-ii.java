import java.util.Stack;

class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> charStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!charStack.isEmpty() && charStack.peek() == c) {
                // increase the count of consecutive same characters
                countStack.push(countStack.pop() + 1);
            } else {
                charStack.push(c);
                countStack.push(1);
            }

            // if count == k, remove those k characters
            if (countStack.peek() == k) {
                charStack.pop();
                countStack.pop();
            }
        }

        // rebuild the string
        StringBuilder sb = new StringBuilder();
        while (!charStack.isEmpty()) {
            char c = charStack.pop();
            int count = countStack.pop();
            for (int i = 0; i < count; i++) {
                sb.append(c);
            }
        }

        return sb.reverse().toString();
    }
}
