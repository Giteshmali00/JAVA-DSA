import java.util.HashMap;

public class _904_fruitIntoBasket {
    //Method 1 :
    public static int totalFruit(int[] fruits) {
        int n = fruits.length, maxFruits = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int j = 0,i = 0; j < n; j++){
            int f = fruits[j];
            map.put(f, map.getOrDefault(f,0)+1);

            while(i < n && map.size() > 2){
                int key = fruits[i];
                if(map.get(key)==1)
                    map.remove(key);
                else
                    map.put(key, map.get(key)-1);
                i++;
            }

            maxFruits = Math.max(maxFruits,j-i+1);
        }
        return maxFruits;
    }
    //Method 2 : Better than Method 1
    public static int totalFruit2(int[] fruits) {
        int n = fruits.length;
        int i = 0, j = 0;
        while(j<n && fruits[i]==fruits[j]){
            j++;
        }
        if(j==n)return n;
        int typ1 = fruits[0], typ2 = fruits[j], t1c = j, t2c = 1, maxFruits = ++j;
        while(j<n){
            int f = fruits[j];
            if(f==typ1)
                t1c++;
            else if(f==typ2)
                t2c++;
            else{
                while(i < n && t1c>0 && t2c>0){
                    if(fruits[i]==typ1)
                        t1c--;
                    else
                        t2c--;
                    i++;
                }
                if(t1c==0){
                    typ1 = typ2;
                    t1c = t2c;
                }
                typ2 = fruits[j];
                t2c = 1;
            }
            j++;
            maxFruits = Math.max(maxFruits,j-i);
        }
        return maxFruits;
    }

    static void main(String[] args) {
        int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};
        print(fruits);
        System.out.println("Maximum fruits : "+totalFruit(fruits));
        System.out.println("Maximum fruits : "+totalFruit2(fruits));
    }
    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
