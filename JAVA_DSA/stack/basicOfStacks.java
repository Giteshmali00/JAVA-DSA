import java.util.Scanner;
import java.util.Stack;
public class basicOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Stack : ");
        int n = sc.nextInt();
        System.out.print("Eneter the Elements : ");
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            st.push(x);
        }

        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println("Size of Stack : "+st.size());
    }
}
