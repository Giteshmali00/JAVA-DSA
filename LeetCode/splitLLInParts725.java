public class splitLLInParts725 {
    public static int sizeOfList(Node head){
        Node temp = head;
        int n = 0;
        while(temp != null){
            temp = temp.next;
            n++;
        }
        return n;
    }
    public static Node[] splitListToParts(Node head, int k) {
        Node[] ans = new Node[k];
        int idx = 0;
        int n = sizeOfList(head);
        int nodes = n/k;
        int rem = n%k;
        Node temp = head;
        int len = 1;
        while(temp != null){
            int size = nodes;
            if(rem > 0) size++;
            if(len == 1) ans[idx++] = temp;
            if(len == size){
                Node hold = temp.next;
                temp.next = null;
                temp = hold;
                rem--;
                len = 1;
            }
            else{
                temp = temp.next;
                len++;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);
        list.insertAtTail(6);
        list.insertAtTail(7);
        list.insertAtTail(8);
        list.insertAtTail(9);
        list.insertAtTail(10);

        int k = 3;
        list.display();
        LinkedList[] ans = new LinkedList[k];
        Node[] parts = splitListToParts(list.head, k);
        for(int i = 0; i < k; i++){
            ans[i] = new LinkedList();
            ans[i].head = parts[i];
        }

        for(int i = 0; i < ans.length; i++){
            ans[i].display();
        }
        
    }
}