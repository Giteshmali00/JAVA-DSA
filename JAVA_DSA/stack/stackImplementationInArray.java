public class stackImplementationInArray {
    public static class Stack{
        int[] stArr;
        int idx = 0;
        Stack(int size){
            stArr = new int[size];
        }
        void push(int value){
            if(idx == stArr.length){
                System.out.println("Stack is Full!");
                return;
            }
            stArr[idx] = value;
            idx++;
        }

        int pop(){
            if(idx == 0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int x = stArr[idx-1];
            stArr[idx-1] = 0;
            idx--;
            return x;
        }

        int peek(){
            if(idx == 0){
                System.out.println("Stack is Empty!!");
                return -1;
            }
            return stArr[idx-1];
        }

        boolean isEmpty(){
            if(idx == 0) return true;
            return false;
        }

        boolean isFull(){
            if(idx == stArr.length) return true;
            return false;
        }

        void display(){
            if(idx == 0){
                System.out.println("Stack is Empty!!");
                return;
            }
            for(int i = 0; i < idx; i++){
                System.out.print(stArr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }

    }
    public static void main(String[] args){
        Stack st = new Stack(10);
        st.push(1);
        st.push(2);
        st.push(3);
        st.display();
        System.out.println("Size : "+st.size());
        System.out.println(st.pop());
        System.out.println(st.peek());
        st.push(9);
        st.push(5);
        st.push(99);
        st.push(49);
        st.display();
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
    }
}
