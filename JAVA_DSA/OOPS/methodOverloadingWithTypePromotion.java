package JAVA_DSA.OOPS;

class Demo {
    void disp(int x) {
        System.out.println("Int-arg method");
    }

    void add(float y) {
        System.out.println("float-arg method");
    }
}

public class methodOverloadingWithTypePromotion {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.disp(10);
        // d1.disp(10.5f); type promotion wasn't possible because int -> float
        d1.disp('A');
        // d1.disp(100L); type promotion wasn't possible because int -> long
        // d1.disp(100.5); type promotion wasn't possible because int -> double
        // d1.disp(true); type promotion in boolean to int is not possible i think...
    }
}
