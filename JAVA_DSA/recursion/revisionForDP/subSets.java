package revisionForDP;

public class subSets {
    static void subset(String str, String ans, int i){
        if(i==str.length()) {
            System.out.print(ans+" ");
            return;
        }
        subset(str,ans+str.charAt(i),i+1);
        subset(str,ans,i+1);
    }

    static void main(String[] args) {
        String str = "gitesh";
        System.out.println(str);
        subset(str,"",0);
    }
}
