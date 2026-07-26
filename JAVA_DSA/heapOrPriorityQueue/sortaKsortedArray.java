import java.util.PriorityQueue;

public class sortaKsortedArray {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int[] arr = {6,5,3,2,8,10,9};
        print(arr);
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        for(int ele : arr){
            pq.add(ele);
            if(pq.size() > k) arr[i++] = pq.poll();
        }
        while(!pq.isEmpty()){
            arr[i++] = pq.poll();
        }
        print(arr);
    }
}
