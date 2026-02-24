//package interviewQuestionsOnStack;

import java.util.Stack;

public class prefixToInfix {
    static void main(String[] args) {
        String prefix = "-9/*+5346";
        System.out.println("Prefix : "+prefix);
        Stack<String> val = new Stack<>();
        int n = prefix.length();
        for(int i = n-1; i >= 0; i--){
            char ch = prefix.charAt(i);
            if(ch >= '0' && ch <= '9'){
                val.push(ch+"");
            }else{
                String v1 = val.pop();
                String v2 = val.pop();
                String infix = "("+v1+ch+v2+")";
                val.push(infix);
            }
        }
        String infix = val.pop();
        System.out.println("Converted to Infix : "+infix);
    }
}
