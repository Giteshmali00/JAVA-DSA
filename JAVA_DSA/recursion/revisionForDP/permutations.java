package revisionForDP;

public class permutations {
    static void printPermu(String str, String ans){
        if(str.isEmpty()) {
            System.out.print(ans+" ");
            return;
        }
        for(int j = 0; j < str.length(); j++){
            printPermu(str.substring(0,j) + str.substring(j+1),ans+str.charAt(j));
        }
    }
    static void main(String[] args) {
        String str = "gitesh";
        printPermu(str,"");
    }
}
