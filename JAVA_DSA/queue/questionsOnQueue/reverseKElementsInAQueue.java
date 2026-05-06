//package questionsOnQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reverseKElementsInAQueue {
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        System.out.println(q);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter K : ");
        int k = sc.nextInt();

        Stack<Integer> st = new Stack<>();
        for(int i = 1; i <= k && !q.isEmpty(); i++){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for(int i = 0; i < q.size()-k; i++){
            q.add(q.poll());
        }
        System.out.println(q);
    }
}
