import java.util.LinkedList;
import java.util.Queue;

public class queueCollectionFramework {
    public static void print(Queue<Integer> q){
        Queue<Integer> temp = new LinkedList<>();
        while(q.size() > 0)
            temp.add(q.remove());

        while(temp.size() > 0){
            System.out.print(temp.peek()+" ");
            q.add(temp.remove());
        }
        System.out.println();
    }
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        print(q);
        q.remove();
        print(q);
        q.poll();
        print(q);
        System.out.println("Peek : "+q.peek());//q.peek()/q.element()
        System.out.println("Size : "+q.size());
    }
}
