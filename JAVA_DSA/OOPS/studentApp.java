
class Student {
    private int rollNo;
    private String name;
    private String address;

    // getters
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // setters
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

}

public class studentApp {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setRollNo(45);
        s1.setName("Gitesh");
        s1.setAddress("MI");

        System.out.println("RollNo  is : " + s1.getRollNo());
        System.out.println("Name    is : " + s1.getName());
        System.out.println("Address is : " + s1.getAddress());
    }
}
