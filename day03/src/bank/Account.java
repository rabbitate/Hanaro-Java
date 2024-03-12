package bank;

public class Account {
    private String accNum;
    private String custName;
    private long balance;
    private double interest;

    public static int count = 0;

    static {
        System.out.println("Start static Area...");
        count = 100000;
        System.out.println("End static Area...");
    }

    public Account(String accNum, String custName, long balance, double interest) {
        this.accNum = String.valueOf(count);
        this.custName = custName;
        if(balance < 0) {
            System.out.println("잔액은 0이상 입력되어야 합니다.");
            return;
        }
        this.balance = balance;
        this.interest = interest;
        count++;
    }

    public void deposit(long money) {
        if(money <= 0) {
            return;
        }
        this.balance += money;
    }

    public void withdraw(long money) {
        if(money <= 0 || balance < money) {
            return;
        }
        this.balance -= money;
    }

    public double getCalInterest() {
        return balance * interest / 100;
    }

    public double getCalInterest(int month) {
        return (int)((balance * interest) / 100);
    }

    public String getAccNum() {
        return accNum;
    }

    public String getCustName() {
        return custName;
    }

    public long getBalance() {
        return balance;
    }

    public double getInterest() {
        return interest;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNum='" + accNum + '\'' +
                ", custName='" + custName + '\'' +
                ", balance=" + balance +
                ", interest=" + interest +
                '}';
    }
}
