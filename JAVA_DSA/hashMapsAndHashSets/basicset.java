import java.util.HashSet;

public class basicset {
    static void setiterate(HashSet<Integer> set){
        for(int ele : set){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set+" "+set.size());
        System.out.println("contains() : "+set.contains(20));
        set.add(40);
        set.add(50);
        System.out.println(set+" "+set.size());
        set.remove(30);
        System.out.println(set+" "+set.size());

        System.out.print("Iterative way to print a Set : ");
        setiterate(set);
    }
}
