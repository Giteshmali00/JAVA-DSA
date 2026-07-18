import java.util.HashMap;

public class basicmap {
    static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Gitesh",45);
        map.put("Chaitanya",46);
        map.put("Charul",47);
        map.put("Harshal",48);
        System.out.println(map+" "+map.size());
        System.out.println("value of key Gitesh : "+map.get("Gitesh"));
        map.remove("Charul");
        System.out.println("Charul removed..");
        System.out.println(map+" "+map.size());
        System.out.println("containsKey() : "+map.containsKey("Harshal"));
        System.out.println("containsValue() : "+map.containsValue(45));
        System.out.println("Update/Replace the value : "+map.put("Harshal",50));
        System.out.println(map+" "+map.size());
    }
}
