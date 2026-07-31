class MinHeap{
    private int[] heap;
    private int size;
    MinHeap(int cap){
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
        if(heap[parent] > heap[idx]){
            swap(parent,idx);
            upheapify(parent);
        }
    }
    void swap(int x, int y){
        int temp = heap[x];
        heap[x] = heap[y];
        heap[y] = temp;
    }
    int peek() throws Exception{
        if(size==0) throw new Error("Heap is Empty!");
        return heap[0];
    }
    int size(){
        return size;
    }
    int remove() throws Exception{
        if(size==0) throw new Exception("Heap is Empty!");
        int x = heap[0];
        heap[0] = heap[size-1];
        size--;
        downheapify(0);
        return x;
    }
    void downheapify(int parent){
        int lc = parent*2+1, rc = parent*2+2;
        int mindx = parent;
        if(lc < size && heap[lc] < heap[mindx]) mindx = lc;
        else if(rc < size && heap[rc] < heap[mindx]) mindx = rc;
        else return;
        swap(mindx,parent);
        downheapify(mindx);
    }
}
public class minHeapImplementationByArray {
    static void main(String[] args) throws Exception{
        MinHeap heap = new MinHeap(10);
        heap.add(10);
        heap.add(30);
        heap.add(40);
//        heap.add(25);
        System.out.println("Size : "+heap.size());
//        heap.add(20);
//        heap.add(20);
//        heap.add(15);
//        heap.add(40);
//        heap.add(35);
//        heap.add(35);
//        heap.add(35);
//        heap.add(35);
//        heap.remove();
//        heap.add(3);
//        heap.remove();
//        heap.remove();
//        heap.remove();
//        heap.add(27);

//        System.out.println(heap.remove());
        while(heap.size()>0){
            System.out.print(heap.remove()+" ");
        }
        System.out.println();
        System.out.println("Size : "+heap.size());
    }
}
