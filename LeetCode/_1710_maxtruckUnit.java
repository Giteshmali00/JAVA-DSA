import java.util.Arrays;

public class _1710_maxtruckUnit {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a1, a2)->a2[1] - a1[1]);
        int maxunit = 0;
        for(int[] a : boxTypes){
            int min = Math.min(a[0],truckSize);
            truckSize -= min;
            maxunit += min*a[1];
            if(truckSize==0)
                return maxunit;
        }
        return maxunit;
    }

    static void main(String[] args) {
        int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
        int truckSize = 10;
        print(boxTypes);
        System.out.println("Tuck size : "+truckSize);
        System.out.println("Maximum Units : "+maximumUnits(boxTypes,truckSize));
    }

    private static void print(int[][] arr) {
        for(int[] a : arr){
            System.out.print("{"+a[0]+", "+a[1]+"} ");
        }
        System.out.println();
    }
}
