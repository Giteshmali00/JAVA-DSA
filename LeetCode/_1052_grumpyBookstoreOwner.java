public class _1052_grumpyBookstoreOwner {
    public static int maxSatisfied(int[] customers, int[] grumpy, int k) {
        int n = customers.length;
        int s = 0, gs = 0;
        int i, j;
        for(j = 0; j < k; j++){
            if(grumpy[j]==1)
                gs += customers[j];
            else
                s += customers[j];
        }
        int maxgs = gs;
        for(i = 0,j = k; j<n; j++,i++){
            if(grumpy[i]==1)
                gs -= customers[i];
            if(grumpy[j]==1){
                gs += customers[j];
            }else
                s += customers[j];
            maxgs = Math.max(maxgs,gs);
        }
        int satisfied = s + maxgs;
        return satisfied;
    }

    static void main(String[] args) {
        int[] customers = {1,0,1,2,1,1,7,5};
        int[] grumpy = {0,1,0,1,0,1,0,1};
        int k = 3;
        System.out.print("Customers : ");
        print(customers);
        System.out.print("Grumpy : ");
        print(grumpy);
        System.out.println("K = "+k);
        System.out.println("Maximum Satisfied customers are : "+maxSatisfied(customers,grumpy,k));
    }
    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
