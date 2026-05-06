//package questionsOnQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println(q);

        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }

        System.out.println(q);
    }
}