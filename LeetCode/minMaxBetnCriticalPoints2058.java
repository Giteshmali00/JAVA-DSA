public class minMaxBetnCriticalPoints2058 {
    public static int[] nodesBetweenCriticalPoints(Node head) {
        Node prev = head;
        Node curr = head.next;
        Node Next = head.next.next;
        int first = -1, last = -1;
        int n = 1;
        int[] ans = {-1,-1};
        int mind = Integer.MAX_VALUE;
        while(Next != null){
            if((curr.val > prev.val && curr.val > Next.val) || (curr.val < prev.val && curr.val < Next.val)){
                if(first == -1) first = n;
                if(last != -1){
                    int dist = n - last;
                    mind = Math.min(mind,dist);
                }
                last = n;
            }
            n++;
            prev = prev.next;
            curr = curr.next;
            Next = curr.next;   
        }
        if(first == last) return ans;
        int maxd = last-first;
        ans[0] = mind;
        ans[1] = maxd;
        return ans;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(5);
        list.insertAtTail(3);
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(5);
        list.insertAtTail(1);
        list.insertAtTail(2);

        list.display();
        int[] ans = nodesBetweenCriticalPoints(list.head);

        System.out.println("Minimum Distance Between two critical points is : "+ans[0]);
        System.out.println("Maximum Distance Between two critical points is : "+ans[1]);
    }
}
