//package interviewQuestionsOnStack;

import java.util.Stack;

public class prefixEvaluation {
    static int evaluate(int v1, int v2, char opt){
             if(opt=='+') return v1+v2;
        else if(opt=='-') return v1-v2;
        else if(opt=='*') return v1*v2;
        else if(opt=='/') return v1/v2;
        return 0;
    }
    static void main(String[] args) {
        String prefix = "-9/*+5346";
        System.out.println("Prefix : "+prefix);
        Stack<Integer> val = new Stack<>();
        int n = prefix.length();
        for(int i = n-1; i >= 0; i--){
            char ch = prefix.charAt(i);
            if(ch >= '0' && ch <= '9'){
                val.push(ch-'0');
            }
            else{
                int v1 = val.pop();
                int v2 = val.pop();
                val.push(evaluate(v1,v2,ch));
            }
        }
        int eval = val.pop();
        System.out.println("Evaluation ans : "+eval);
    }
}
