import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        int s = q.size();
        for (int i = 0; i < s - 1; i++) {
            q.add(q.peek());
            q.poll();
        }
    }

    public int pop() {
        if (q.isEmpty())
            return -1;
        return q.poll();
    }

    public int top() {
        if (q.isEmpty())
            return -1;
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */