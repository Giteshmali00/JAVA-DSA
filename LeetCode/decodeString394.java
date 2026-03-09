import java.util.Stack;

public class decodeString394 {
    public static String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch != ']') st.push(ch);
            else {
                StringBuilder sb = new StringBuilder();
                while(st.peek() != '[') sb.append(st.pop());
                st.pop();
                int k = 0;
                int base = 1;
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    k = (st.pop() - '0') * base + k;
                    base = base*10;
                }

                while(k-- > 0){
                    for(int j = sb.length()-1; j >= 0; j--)
                        st.push(sb.charAt(j));
                }
            }
        }
        char[] result = new char[st.size()];
        for(int i = st.size() - 1; i >= 0; i--)
            result[i] = st.pop();

        return new String(result);
    }
    static void main(String[] args) {
        String str = "3[a2[c]]";
        System.out.println(str);
        String ans = decodeString(str);
        System.out.println(ans);
    }
}
