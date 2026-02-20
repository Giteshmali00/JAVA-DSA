import java.util.Scanner;
import java.util.Stack;

public class validParentheses20 {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
            }else{
                if(st.size()==0) return false;
                if(st.peek() == '(' && s.charAt(i) == ')') st.pop();
                else if(st.peek() == '[' && s.charAt(i) == ']') st.pop();
                else if(st.peek() == '{' && s.charAt(i) == '}') st.pop();
                else return false;
            }
        }
        if(st.size() == 0) return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Parentheses : ");
        System.out.println("Is Parentheses Valid? : "+isValid(sc.nextLine()));
    }
}
