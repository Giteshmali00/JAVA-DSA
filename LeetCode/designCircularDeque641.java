import java.util.Arrays;
class MyCircularDeque {
    int[] arr;
    int front;
    int rear;
    int size;
    public MyCircularDeque(int k) {
        arr = new int[k];
        front = -1;
        rear = -1;
        size = 0;
    }
    
    public boolean insertFront(int value) {
        if(size==arr.length) return false;
        if(front == -1){
            front = rear = 0;
            arr[0] = value;
        }else if(front == 0){
            front = arr.length-1;
            arr[front] = value;
        }else{
            arr[--front] = value;
        }
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(size == arr.length) return false;
        if(rear == -1){
            front = rear = 0;
            arr[0] = value;
        }else if(rear == arr.length - 1){
            rear = 0;
            arr[0] = value;
        }else{
            arr[++rear] = value;
        }
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(size==0) return false;
        if(front == arr.length - 1) front = 0;
        else front++;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(size == 0) return false;
        if(rear == 0) rear = arr.length -1;
        else rear--;
        size--;
        return true;
    }
    
    public int getFront() {
        if(size==0) return -1;
        return arr[front];
    }
    
    public int getRear() {
        if(size==0) return -1;
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == arr.length;
    }
}
public class designCircularDeque641 {
    public static void main(String[] args) {
        MyCircularDeque myCircularDeque = new MyCircularDeque(3);
        System.out.println(myCircularDeque.insertLast(1));  // return True
        System.out.println(myCircularDeque.insertLast(2));  // return True
        System.out.println(myCircularDeque.insertFront(3)); // return True
        System.out.println(myCircularDeque.insertFront(4)); // return False, the queue is full.
        System.out.println(myCircularDeque.getRear());      // return 2
        System.out.println(myCircularDeque.isFull());       // return True
        System.out.println(myCircularDeque.deleteLast());  // return True
        System.out.println(myCircularDeque.insertFront(4)); // return True
        System.out.println(myCircularDeque.getFront());     // return 4
    }
}
