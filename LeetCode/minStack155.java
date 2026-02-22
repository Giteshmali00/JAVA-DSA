import java.util.Stack;

public class minStack155 {
    public static class MinStack{
        Stack<Long> st = new Stack<>();
        long min = 0;
        void push(int val) {
            long x = (long)val;
            if(st.size() == 0){
                min = x;
                st.push(x);
            }else if(x < min){
                st.push(2*x-min);
                min = x;
            }
            else{
                st.push(x);
            }
        }

        void pop() {
            if(st.peek() < min)
                min = 2*min - st.pop();
            else
                st.pop();
        }

        int top() {
            if(st.peek() < min)
                return (int)min;
            else{
                long x = st.peek();
                return (int)x;
            }
        }

        int getMin() {
            return (int)min;
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
