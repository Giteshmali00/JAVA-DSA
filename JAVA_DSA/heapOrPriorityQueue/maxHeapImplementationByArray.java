class MaxHeap{
    private int[] heap;
    private int size;
    MaxHeap(int cap){
        heap = new int[cap];
        size = 0;
    }
    void add(int val) throws Exception{
        if(size==heap.length) throw new Exception("Heap is Full!");
        heap[size++] = val;
        upheapify(size-1);
    }
    void upheapify(int idx){
        if(idx==0) return;
        int parent = (idx-1)/2;
        if(heap[parent] < heap[idx]){
            swap(parent, idx);
            upheapify(parent);
        }
    }
    void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    int size(){
        return size;
    }
    int remove() throws Exception{
        if(size==0) throw new Exception("Heap is Empty!");
        int x = heap[0];
        heap[0] = heap[size---1];
        downheapify(0);
        return x;
    }
    void downheapify(int parent){
        int lc = parent*2+1, rc = parent*2+2;
        int mindx = parent;
        if(lc < size && heap[lc] > heap[mindx]) mindx = lc;
        if(rc < size && heap[rc] > heap[mindx]) mindx = rc;
        if(mindx==parent) {
            swap(mindx,parent);
            return;
        }
        swap(mindx,parent);
        downheapify(mindx);
    }
    int peek() throws Exception{
        if(size==0) throw new Exception("Heap is Empty!");
        return heap[0];
    }
}
public class maxHeapImplementationByArray {

    static void main(String[] args) throws Exception{
        MaxHeap mp = new MaxHeap(10);
        mp.add(5);
        mp.add(10);
        mp.add(30);
        mp.add(20);
        mp.add(15);
        System.out.println("Size:"+mp.size());
        System.out.println(mp.peek());

        while(mp.size()>0){
            System.out.print(mp.remove()+" ");
        }
    }
}
