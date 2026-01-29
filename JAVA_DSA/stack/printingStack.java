import java.util.Stack;

public class printingStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

        Stack<Integer> temp = new Stack<>();
        while(st.size() > 0){
            temp.push(st.pop());
        }

        while(temp.size() > 0){
            int x = temp.pop();
            System.out.print(" "+x);
            st.push(x);
        }
        System.out.println();

        System.out.println(st);
    }
}
