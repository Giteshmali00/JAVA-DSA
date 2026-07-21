import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class finding3DigitEvenNumbers2094 {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int[] findEvenNumbers(int[] digits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<digits.length; i++){
            map.put(digits[i], map.getOrDefault(digits[i],0)+1);
        }
        for(int i = 100; i <= 999; i++){
            int ele = i;
            int d1 = ele%10;
            if(d1%2!=0) continue;
            ele /= 10;
            int d2 = ele%10;
            ele /= 10;
            int d3 = ele%10;
            if(d1!=d2 && d2!=d3 && d1!=d3){
                if(map.containsKey(d1) && map.containsKey(d2) && map.containsKey(d3)) list.add(i);
            }else if(d1==d2 && d1==d3 && map.containsKey(d1)){
                if(map.get(d1)>=3) list.add(i);
            }else if(d1==d2 && map.containsKey(d1)){
                if(map.get(d1)>=2 && map.containsKey(d3)) list.add(i);
            }else if(d1==d3 && map.containsKey(d1)){
                if(map.get(d1)>=2 && map.containsKey(d2)) list.add(i);
            }else if(d2==d3 && map.containsKey(d2)){
                if(map.get(d2)>=2 && map.containsKey(d1)) list.add(i);
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }

    static void main(String[] args) {
        int[] digits = {2,2,8,8,2};
        print(digits);
        System.out.print("valid 3 digits even numbers formed from the Array 69:");
        print(findEvenNumbers(digits));
    }
}
