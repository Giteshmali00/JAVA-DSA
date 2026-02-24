//package interviewQuestionsOnStack;

import java.util.Stack;

public class infixToPostfix {
    public static String postfix(String v1, String v2,char opt){
        return v1+v2+opt;
    }
    public static int precedence(char ch){
        if (ch=='+' || ch=='-') return 1;
        else if (ch=='*' || ch=='/') return 2;
        return 0;
    }
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6"; // postfix = 953+4*6/-
        System.out.println("Infix : "+infix);
        Stack<String> val  = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i = 0; i < infix.length(); i++){
            char ch = infix.charAt(i);
            if(ch >= '0' && ch <= '9')
                val.push(ch+"");
            else if(ch=='(')
                op.push(ch);
            else if(ch==')'){
                while (op.peek() != '(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char opt = op.pop();
                    val.push(postfix(v1,v2,opt));
                }
                op.pop();
            }
            else {
                while(!op.isEmpty() && op.peek() != '(' &&
                        precedence(op.peek()) >= precedence(ch)){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char opt = op.pop();
                    val.push(postfix(v1,v2,opt));
                }
                op.push(ch);
            }
        }

        while(!op.isEmpty()){
            String v2 = val.pop();
            String v1 = val.pop();
            char opt = op.pop();
            val.push(postfix(v1,v2,opt));
        }
        String postfix = val.pop();
        System.out.println("Postfix : "+postfix);
    }
}
