package revisionForDP;

public class printArray {
    static void print(int[] arr, int n){
        if(n==-1) return;
        print(arr,n-1);
        System.out.print(arr[n]+" ");
    }
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,7,8,9};
        print(arr,arr.length-1);
    }
}
