import java.util.HashMap;
import java.util.HashSet;

public class uniqueLength3PalindromicSubsequences1930 {

    public static int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer> fmap = new HashMap<>();
        HashMap<Character,Integer> lmap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!fmap.containsKey(ch)) fmap.put(ch,i);
            lmap.put(ch,i);
        }

        int count = 0;
        for(char key : fmap.keySet()){
            HashSet<Character> set = new HashSet<>();
            for(int i = fmap.get(key)+1; i <= lmap.get(key)-1; i++){
                set.add(s.charAt(i));
            }
            count += set.size();
        }

        return count;
    }

    static void main(String[] args) {
        String s = "bbcbaba";
        System.out.println("String : "+s);
        System.out.print("Unique number of palindromic subsequences are : "+countPalindromicSubsequence(s));
    }
}
