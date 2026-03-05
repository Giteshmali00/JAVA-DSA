import java.util.Stack;

public class removAdjacentDupli1047 {
    public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = s.length()-1; i >= 0; i--){
            char ch = s.charAt(i);
            if(!st.isEmpty() && st.peek() == ch) st.pop();
            else st.push(ch);
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()) ans.append(st.pop());

        return ans.toString();
    }
    static void main(String[] args) {
        String s = "aabbca";
        System.out.println(s);
        System.out.println(removeDuplicates(s));
    }
}
