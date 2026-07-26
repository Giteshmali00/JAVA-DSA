import java.util.Collections;
import java.util.PriorityQueue;

public class heapInCollectionFramework {
    static void main(String[] args) {
        //Max Heap :
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        //Min Heap :
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(15);
        pq.add(12);
        pq.add(17);
        System.out.println(pq+" size:"+pq.size());
        System.out.println("top element : "+pq.peek());
        pq.poll();
        System.out.println(pq+" size:"+pq.size());
        System.out.println("top element : "+pq.peek());
    }
}
