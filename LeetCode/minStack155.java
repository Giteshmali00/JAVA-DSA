import java.util.Stack;

public class minStack155 {
    public static class MinStack {
        Stack<Integer> st = new Stack<>();
        int min = Integer.MAX_VALUE;
        public MinStack() {

        }
        public void push(int val) {
            if(val <= min){
                st.push(min);
                min = val;
            }
            st.push(val);
        }

        public void pop() {
            if(st.pop() == min)
                min = st.pop();
        }

        public int top() {
            return st.peek();
        }

        public int getMin() {
            return min;
        }
    }

    public static void main(String[] args){
        MinStack ms = new MinStack();
        ms.push(4);
        ms.push(2);
        ms.push(7);
        ms.push(1);
        System.out.println("Minimum Element of current Stack is : "+ms.getMin());
        ms.pop();
        System.out.println("Minimum Element of current Stack is : "+ms.getMin());

    }
}
