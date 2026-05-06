import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueue225 {
    public static class MyStack {
        Queue<Integer> q = new LinkedList<>();
        public MyStack() {

        }

        public void push(int x) {
            q.add(x);
            for(int i = 1; i <= q.size()-1; i++){
                q.add(q.poll());
            }
        }

        public int pop() {
            return q.poll();
        }

        public int top() {
            return q.peek();
        }

        public boolean empty() {
            return q.isEmpty();
        }

        public void display(){
            for(int i = 1; i <= q.size(); i++){
                System.out.print(q.peek()+" ");
                q.add(q.poll());
            }
            System.out.println();
        }
    }

    static void main(String[] args) {
        MyStack st = new MyStack();
        System.out.println("isEmpty() : "+st.empty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        System.out.println("top() : "+st.top());
        System.out.println("pop() : "+st.pop());
        st.display();
        System.out.println("isEmpty() : "+st.empty());

    }
}
