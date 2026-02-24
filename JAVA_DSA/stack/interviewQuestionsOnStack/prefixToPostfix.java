//package interviewQuestionsOnStack;

import java.util.Stack;

public class prefixToPostfix {
    public static String postfix(String v1, String v2, char opt){
        return v1+v2+opt;
    }
    static void main(String[] args) {
        String prefix = "-9/*+5346";
        System.out.println("Prefix : "+prefix);
        Stack<String> val = new Stack<>();
        int n = prefix.length();
        for(int i = n-1; i >= 0; i--){
            char ch = prefix.charAt(i);
            if(ch >= '0' && ch <= '9'){
                val.push(ch+"");
            }
            else{
                String v1 = val.pop();
                String v2 = val.pop();
                val.push(postfix(v1,v2,ch));
            }
        }
        String postfix = val.pop();
        System.out.println("Converted to Postfix : "+postfix);
    }
}
