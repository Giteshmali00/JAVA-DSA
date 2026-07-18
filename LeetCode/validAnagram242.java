
import java.util.Arrays;
import java.util.HashMap;

public class validAnagram242 {
    //Method 2 : Using Hashmaps
    public static boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> cMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(cMap.containsKey(ch)) cMap.put(ch,cMap.get(ch)+1);
            else cMap.put(ch,1);

            char ch2 = t.charAt(i);
            if(cMap.containsKey(ch2)) cMap.put(ch2,cMap.get(ch2)-1);
            else cMap.put(ch2,-1);
        }
        for(int val : cMap.values()){
            if(val!=0) return false;
        }
        return true;
    }
    //Method 1 : using arrays;
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] ch = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "gitesh";
        String str2 = "tigesh";

        System.out.print(isAnagram(str1, str2));
        System.out.println();
        System.out.print(isAnagram2(str1, str2));
    }
}