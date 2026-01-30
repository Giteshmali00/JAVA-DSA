import java.util.Stack;
public class deleteElement {
    public static void remove(Stack<Integer> st, int idx)throws Error{
        if(idx >= st.size()) throw new Error("Invalid Index!");
        if(st.size()-1 == idx){
            st.pop();
            return;
        }
        int x = st.pop();
        remove(st, idx);
        st.push(x);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

        remove(st, 4);

        System.out.println(st);
    }
}
