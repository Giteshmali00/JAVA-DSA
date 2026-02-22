//package interviewQuestionsOnStack;

import java.util.Stack;

public class prefix {
    public static String operation(char opt, String v1, String v2){
        return opt + v1 + v2;
    }
    public static int precedence(char opt){
        if (opt == '+' || opt == '-') return 1;
        else if(opt == '*' || opt == '/') return 2;
        return 0;
    }
    public static void main(String[] args){
        String str = "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9')
                val.push(ch+"");
            else if(ch == '(')
                op.push(ch);
            else if(ch == ')'){
                while(op.peek() != '('){
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char opt = op.pop();
                    val.push(operation(opt,v1,v2));
                }
                op.pop();
            }
            else{
                while(!op.isEmpty() && op.peek() != '(' &&
                        precedence(op.peek()) >= precedence(ch)){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char opt = op.pop();
                    val.push(operation(opt,v1,v2));
                }
                op.push(ch);
            }
        }
        while(!op.isEmpty()){
            String v2 = val.pop();
            String v1 = val.pop();
            char opt = op.pop();
            val.push(operation(opt,v1,v2));
        }

        System.out.println(val.peek());
    }
}
