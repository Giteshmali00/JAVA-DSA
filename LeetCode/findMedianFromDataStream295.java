import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;
    public MedianFinder() {
        this.left = new PriorityQueue<>(Collections.reverseOrder());
        this.right = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if(left.isEmpty()) left.add(num);
        else{
            if(left.peek() > num)
                left.add(num);
            else
                right.add(num);
        }

        if(left.size() == right.size()+2)
            right.add(left.poll());
        else if(right.size() == left.size()+2)
            left.add(right.poll());
    }

    public double findMedian() {
        int ls = left.size(), rs = right.size();
        if(ls>rs)
            return left.peek();
        if(rs>ls)
            return right.peek();

        return (left.peek() + right.peek())/2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
public class findMedianFromDataStream295 {
    static void main(String[] args) {
        MedianFinder mf = new MedianFinder();
        mf.addNum(2);
        mf.addNum(5);
        mf.addNum(1);
        System.out.println("Median of current Stream : "+mf.findMedian());
        mf.addNum(8);
        mf.addNum(7);
        mf.addNum(6);
        System.out.println("Median of current Stream : "+mf.findMedian());
    }
}
