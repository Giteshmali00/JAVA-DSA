import java.util.*;

public class interleavetheFirstHalfOfTheQueueWithSecondHalf {
    public static void rearrangeQueue(Queue<Integer> q) {
        // Re Order Queue Using Stack
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < q.size(); i++){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for(int i = 0; i < q.size()/2; i++){
            q.add(q.poll());
        }
        for(int i = 0; i < q.size(); i++){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
            q.add(q.poll());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        System.out.println(q);
        rearrangeQueue(q);
        System.out.println(q);
    }
}
