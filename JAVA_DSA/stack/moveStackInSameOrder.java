import java.util.Stack;
public class moveStackInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st);
        
        Stack<Integer> temp = new Stack<>();
        while(st.size() > 0){
            temp.push(st.pop());
        }
        System.out.println(temp);


        Stack<Integer> gt = new Stack<>();

        while(temp.size() > 0){
            gt.push(temp.pop());
        }

        System.out.println(gt);
    }
}
