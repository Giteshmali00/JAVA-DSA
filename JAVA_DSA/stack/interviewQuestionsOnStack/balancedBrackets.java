//package interviewQuestionsOnStack;

import java.util.Scanner;
import java.util.Stack;

public class balancedBrackets {
    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '(') st.push('(');
            else {
                if(st.size() == 0) return false;
                st.pop();
            }
        }
        if(st.size() == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
