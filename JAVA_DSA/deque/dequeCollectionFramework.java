import java.util.Deque;
import java.util.LinkedList;

public class dequeCollectionFramework {
    static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();

        dq.add(1);
        dq.add(2);
        dq.add(3);
        dq.add(4);
        dq.add(3);
        dq.add(2);
        System.out.println("\nadd() 6 Times\n"+dq);
        dq.addFirst(5);
        System.out.println("\naddFirst()\n"+dq);
        dq.addLast(6);
        System.out.println("\naddLast()\n"+dq);
        dq.removeFirst();
        System.out.println("\nremoveFirst()\n"+dq);
        dq.removeLast();
        System.out.println("\nremoveLast()\n"+dq);
        System.out.println("\ngetFirst()\n"+dq.getFirst());
        System.out.println("\ngetLast()\n"+dq.getLast());
        dq.removeFirstOccurrence(2);
        System.out.println("\nremoveFirstOccurrence() of 2\n"+dq);
        dq.removeLastOccurrence(3);
        System.out.println("\nremoveLastOccurrence() of 3\n"+dq);
        dq.addAll(dq);
        System.out.println("\naddAll() dq in dq\n"+dq);

    }
}
