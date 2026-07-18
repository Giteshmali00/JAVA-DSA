import java.util.HashSet;

public class findMaximumNumberOfStringPairs2744 {
    public static void print(String[] arr){
        for(String s : arr){
            System.out.print(s+" ");
        }
        System.out.println();
    }
    public static int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> s = new HashSet<>();
        int count = 0;
        for(int i = 0; i < words.length; i++){
            String rev = new StringBuilder(words[i]).reverse().toString();
            if(s.contains(rev)) count++;
            else s.add(words[i]);
        }
        return count;
    }
    static void main(String[] args) {
        String[] words = {"cd","ac","dc","ca","zz"};
        System.out.print("String : ");
        print(words);
        System.out.println("Maximum number of String Pairs : "+maximumNumberOfStringPairs(words));
    }
}
