import java.util.HashMap;

public class iterateOverHashmap {
    static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Gitesh",45);
        map.put("Chaitanya",46);
        map.put("Charul",47);
        map.put("Harshal",48);

        for(String key : map.keySet()){
            int val = map.get(key);
            System.out.println(key + " " + val);
        }
        System.out.println();

        for (int val : map.values()){
            System.out.println(val+" ");
        }
        System.out.println();

        for(Object pair : map.entrySet()){
            System.out.println(pair);
        }
        System.out.println();
    }
}
