import java.util.HashSet;

public class longestSubstring3 {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int ans = 0;
        while(j < s.length()){
            if(set.contains(s.charAt(j)))
                set.remove(s.charAt(i++));
            else
                set.add(s.charAt(j++));

            if(ans<set.size()) ans = set.size();
        }
        return ans;
    }

    static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("String : "+s);
        System.out.println("Longest substring without repeating characters : "+lengthOfLongestSubstring(s));
    }
}
