public class doublyLLImplemetation {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);

        list.display();

        list.insertAtHead(5);
        list.insertAtHead(4);
        list.insertAtHead(3);

        list.display();

        list.insert(2, 64);
        list.display();
        list.insert(0, 10);
        list.display();
        list.insert(7, 20);
        list.display();

        list.deleteAtHead();
        list.display();

        list.deleteAtTail();
        list.display();

        list.delete(3);
        list.display();

        System.out.println(list.get(5));

        list.set(3,30);
        list.display();


        System.out.println("Size = "+list.size);
    }
}
