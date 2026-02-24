//package interviewQuestionsOnStack;

import java.util.Stack;

public class postfixToInfix {
    static void main(String[] args) {
        String postfix = "953+4*6/-";
        System.out.println("Postfix : "+postfix);
        Stack<String> val = new Stack<>();
        for(int i = 0; i < postfix.length(); i++){
            char ch = postfix.charAt(i);
            if(ch >= '0' && ch <= '9'){
                val.push(ch+"");
            }else{
                String v2 = val.pop();
                String v1 = val.pop();
                String infix = "("+v1+ch+v2+")";
                val.push(infix);
            }
        }
        String infix = val.pop();
        System.out.println("Converted to Infix : "+infix);
    }
}
