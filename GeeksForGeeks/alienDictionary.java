import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class alienDictionary {
    public static String findOrder(String[] words) {
        List<List<Character>> adj = new ArrayList<>();
        for(int i=0; i<26; i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[26];
        for(int i=0; i<words.length-1; i++){
            for(int j=0; j<words[i].length() && j<words[i+1].length(); j++){
                char lch = words[i].charAt(j), rch = words[i+1].charAt(j);
                if(lch!=rch){
                    adj.get(lch-'a').add(rch);
                    indegree[rch-'a']++;
                    break;
                }
            }
        }
        int uniq = 0;
        Queue<Character> q = new LinkedList<>();
        boolean[] vis = new boolean[26];
        for(String str : words){
            for(char ch : str.toCharArray()){
                if(!vis[ch-'a']){
                    if(indegree[ch-'a']==0){
                        q.add(ch);
                    }
                    uniq++;
                    vis[ch-'a'] = true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!q.isEmpty()){
            char front = q.remove();
            sb.append(front);
            for(char ch : adj.get(front-'a')){
                indegree[ch-'a']--;
                if(indegree[ch-'a']==0) q.add(ch);
            }
        }
        if(sb.length()!=uniq) return "";
        return sb.toString();
    }

    static void main(String[] args) {
        String[] words = {"baa", "abcd", "abca", "cab", "cad"};
        print(words);
        System.out.println("Alien Dictionary: "+findOrder(words));
    }

    private static void print(String[] words) {
        for(String s : words){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
