package JAVA_DSA.OOPS;

class Account {
    private double balance;

    public double getBalance(double balance) {
        boolean result = validate("gitesh", "gitesh12");
        if (result) {
            this.balance = this.balance - balance;
            return balance;
        } else {
            System.out.println("Invalid username/password...");
            return 0;
        }
    }

    public void setBalance(double balance) {
        boolean result = validate("gitesh", "gitesh123");
        if (result) {
            this.balance = this.balance + balance;
            System.out.println("Credited to the account");
        } else {
            System.out.println("Invalid usernam/password please try again...");
        }
    }

    public boolean validate(String userName, String password) {
        return userName.equalsIgnoreCase("gitesh") && password.equals("gitesh123");
    }
}

public class testApp {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(1000);
        double balance = acc.getBalance(500);
        System.out.println("Withdrawing :: " + balance + " Amount");
    }
}
