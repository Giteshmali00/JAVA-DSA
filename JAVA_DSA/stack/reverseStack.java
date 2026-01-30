import java.util.Stack;

public class reverseStack {
    public static void pushAtBottom(Stack<Integer> st, int ele){
        if(st.size() == 0){
            st.push(ele);
            return;
        }
        int e = st.pop();
        pushAtBottom(st, ele);
        st.push(e);

    }
    public static void reverseRec(Stack<Integer> st){
        if(st.size() == 1) return;
        int ele = st.pop();
        reverseRec(st);
        pushAtBottom(st,ele);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        System.out.println(st);

        reverseRec(st);

        System.out.println(st);
    }
}
