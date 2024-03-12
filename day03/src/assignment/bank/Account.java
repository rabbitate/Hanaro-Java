package assignment.bank;

public class Account {
    private String accNum;
    private String custName;
    private double interest;
    private long balance;

    public Account() {
    }

    public Account(String accNum, String custName, double interest, long balance) {
        this.accNum = accNum;
        this.custName = custName;
        this.interest = interest;
        this.balance = balance;
    }

    public void withdraw(long money) {
        this.balance -= money;
    }

    public void deposit(long money) {
        this.balance += money;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public double getCalInterest() {
        return this.balance * this.interest;
    }

    public String getAccNum() {
        return accNum;
    }

    public String getCustName() {
        return custName;
    }

    public double getInterest() {
        return interest;
    }

    public long getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNum='" + accNum + '\'' +
                ", custName='" + custName + '\'' +
                ", interest=" + interest +
                ", balance=" + balance +
                '}';
    }
}
