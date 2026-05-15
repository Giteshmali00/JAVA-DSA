import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class revealCardsIncreasingOrder950{
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
        int[] ans = new int[n];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            q.add(i);
        }

        for(int i = 0; i < n; i++){
            ans[q.poll()] = deck[i];
            q.add(q.poll());
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] deck = {17,13,11,2,3,5,7};
        int[] ans = deckRevealedIncreasing(deck);
        print(deck);
        print(ans);
    }
}