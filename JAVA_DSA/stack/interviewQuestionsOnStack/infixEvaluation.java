import java.util.Stack;

public class infix {
    public static int precedence(char ch){
        if(ch == '+' || ch == '-') return 1;
        if(ch == '*' || ch == '/') return 2;
        return 0;
    }

    public static int operation(int v1, int v2, char op){
        if(op == '+') return v1 + v2;
        else if(op == '-') return v1 - v2;
        else if(op == '*') return v1 * v2;
        else if(op == '/') return v1 / v2;
        return 0;
    }

    public static void main(String[] args){

        String str = "9-(5+3)*4/6+5";

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if(ch >= '0' && ch <= '9'){
                val.push(ch-'0');
            }

            else if(ch=='(')
                op.push(ch);

            else if(ch==')'){
                while(op.peek()!='('){
                    int v2 = val.pop();
                    int v1 = val.pop();
                    val.push(operation(v1,v2,op.pop()));
                }
                op.pop();
            }
            // Only this block change
            else{
                while(!op.isEmpty() && op.peek()!='(' &&
                        precedence(op.peek()) >= precedence(ch)){

                    int v2 = val.pop();
                    int v1 = val.pop();
                    val.push(operation(v1,v2,op.pop()));
                }
                op.push(ch);
            }
        }

        while(!op.isEmpty()){
            int v2 = val.pop();
            int v1 = val.pop();
            val.push(operation(v1,v2,op.pop()));
        }

        System.out.println(val.peek());
    }
}