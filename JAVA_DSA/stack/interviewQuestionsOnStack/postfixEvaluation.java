//package interviewQuestionsOnStack;

import java.util.Stack;

public class postfixEvaluation {
    static int evaluate(int v1, int v2, char opt){
        if(opt=='+') return v1+v2;
        else if(opt=='-') return v1-v2;
        else if(opt=='*') return v1*v2;
        else if(opt=='/') return v1/v2;
        return 0;
    }
    static void main(String[] args) {
        String postfix = "953+4*6/-";
        System.out.println("Postfix : "+postfix);
        Stack<Integer> val = new Stack<>();

        for(int i=0; i<postfix.length(); i++){
            char ch = postfix.charAt(i);
            if(ch>='0' && ch<='9'){
                val.push(ch-'0');
            }
            else{
                int v2 = val.pop();
                int v1 = val.pop();
                val.push(evaluate(v1,v2,ch));
            }
        }
        int eval = val.pop();
        System.out.println("Evaluation ans : "+eval);
    }
}
