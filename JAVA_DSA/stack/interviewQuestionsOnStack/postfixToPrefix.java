//package interviewQuestionsOnStack;

import java.util.Stack;

public class postfixToPrefix {
    public static String prefix(char opt, String v1, String v2){
        return opt + v1 + v2;
    }
    static void main(String[] args) {
        String postfix = "953+4*6/-";
        System.out.println("Postfix : "+postfix);
        Stack<String> val = new Stack<>();
        for (int i = 0; i < postfix.length(); i++){
            char ch = postfix.charAt(i);
            if(ch >= '0' && ch <= '9'){
                val.push(ch+"");
            }
            else{
                String v2 = val.pop();
                String v1 = val.pop();
                val.push(prefix(ch,v1,v2));
            }
        }
        String prefix = val.pop();
        System.out.println("Coverted into Prefix : "+prefix);
    }
}
