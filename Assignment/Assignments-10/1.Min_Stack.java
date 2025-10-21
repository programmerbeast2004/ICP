import java.util.ArrayList;
import java.util.List;

class MinStack {
    List<int[]> list;
    int smallest;

    public MinStack() {
        list = new ArrayList<>();
        smallest = 0;

    }

    public void push(int val) {
        if (list.isEmpty()) {
            list.add(new int[] { val, -1 });
            smallest = 0;
            return;
        } else {
            if (list.get(smallest)[0] <= val) {
                list.add(new int[] { val, smallest });
            } else {
                list.add(new int[] { val, smallest });
                smallest = list.size() - 1;
            }
        }
    }

    public void pop() {
        smallest = list.get(list.size() - 1)[1];
        list.remove(list.size() - 1);
    }

    public int top() {
        return list.get(list.size() - 1)[0];
    }

    public int getMin() {
        return list.get(smallest)[0];
    }
}