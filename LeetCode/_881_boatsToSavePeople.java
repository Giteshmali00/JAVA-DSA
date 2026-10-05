import java.util.*;

public class _881_boatsToSavePeople {
    public static int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        int boats = 0;
        Arrays.sort(people);
        int i = 0, j = n-1;
        while(i<=j){
            if(people[j]+people[i]<=limit){
                i++;
                j--;
            }else j--;
            boats++;
        }
        return boats;
    }

    static void main(String[] args) {
        int[] people = {3,5,3,4};
        int limit = 5;
        print(people);
        System.out.println("Limit per boat : "+limit);
        System.out.println("Total number of rescue boats : "+numRescueBoats(people,limit));
    }

    private static void print(int[] arr) {
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
