import java.util.HashMap;
import java.util.Map;

public class _781_rabbitsInForest {
    public static int numRabbits(int[] ans) {
        int n = ans.length;
        int rabits = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele : ans){
            map.put(ele+1,map.getOrDefault(ele+1,0)+1);
        }
        for(int key : map.keySet()){
            int val = map.get(key);
            rabits += key * (val/key);
            if(val%key!=0) rabits += key;
        }
        return rabits;
    }

    static void main(String[] args) {
        int[] ans = {0,1,0,2,0,1,0,2,1,1};
        print(ans);
        System.out.println("Minimum number of rabbits could be in the forest: "+numRabbits(ans));
    }
    private static void print(int[] arr) {
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
