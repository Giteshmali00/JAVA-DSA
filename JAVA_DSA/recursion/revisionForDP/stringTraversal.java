package revisionForDP;

public class stringTraversal {
    static String printWithoutA(String str,int i){
        if(i==str.length()) return "";
        if(str.charAt(i)=='a') return printWithoutA(str,i+1);
        return str.charAt(i) + printWithoutA(str,i+1);
    }
    static void main(String[] args) {
        String str = "bca is a blast";
        System.out.println(str);
        System.out.println(printWithoutA(str,0));
    }
}
