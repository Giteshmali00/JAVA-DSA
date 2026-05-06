import java.util.Stack;

public class queueUsingStack232 {
    // pop efficient code
    public static class MyQueue {
        Stack<Integer> st;
        public MyQueue() {
            st = new Stack<>();
        }

        public void push(int x) { //O(n)
            Stack<Integer> temp = new Stack<>();
            while(!st.isEmpty()){
                temp.push(st.pop());
            }
            st.push(x);
            while(!temp.isEmpty()){
                st.push(temp.pop());
            }
        }

        public int pop() { //O(1)
            return st.pop();
        }

        public int peek() {//O(1)
            return st.peek();
        }

        public boolean empty() {
            return st.isEmpty();
        }
        public void display(){
            Stack<Integer> temp = new Stack<>();
            while(!st.isEmpty()){
                System.out.print(st.peek()+" ");
                temp.push(st.pop());
            }
            while(!temp.isEmpty()){
                st.push(temp.pop());
            }
            System.out.println();
        }
    }
    static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.display();
        System.out.println("peek() : "+q.peek());
        System.out.println("peek() : "+q.pop());
        System.out.println("peek() : "+q.empty());
        q.display();
    }
}
