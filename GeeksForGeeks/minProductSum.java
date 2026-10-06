public class minProductSum {
    public static int minProd(int[] arr) {
        int maxNeg = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int negNum = 0;
        int product = 1;
        for(int ele : arr){
            if(ele<0) {
                maxNeg = Math.max(maxNeg,ele);
                negNum++;
            }
            if(ele!=0) product *= ele;
            min = Math.min(min,ele);
        }
        if(negNum==0){
            return min;
        }else if(negNum%2==0) {
            return product / maxNeg;
        }
        return product;
    }

    static void main(String[] args) {
        int[] arr = {4, -2, 5};
        print(arr);
        System.out.println("Minimum product: "+minProd(arr));
    }

    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
