import java.util.Arrays;
import java.util.Scanner;

public class minCostToCut {
    public static int minCost(int n, int m, int[] x, int[] y) {
        Arrays.sort(x);
        Arrays.sort(y);
        int vp = 1, hp = 1, total = 0;
        int i = x.length-1, j = y.length-1;
        while(i >= 0 && j >= 0){
            if(x[i]>=y[j]){
                total += hp * x[i--];
                vp++;
            }else{
                total += vp * y[j--];
                hp++;
            }
        }
        while(i >= 0){
            total += hp * x[i--];
        }
        while(j >= 0){
            total += vp * y[j--];
        }
        return total;
    }

    static void main(String[] args) {
        int n = 3;
        int m = 3;
        int[] x = {2,1};
        int[] y = {4,3};
        System.out.print("x : ");
        print(x);
        System.out.print("y : ");
        print(y);
        System.out.println("Minimum Cost to cut : "+minCost(n,m,x,y));
    }

    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
