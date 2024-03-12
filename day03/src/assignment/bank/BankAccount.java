package assignment.bank;

public class BankAccount extends Account{
    private int autoTransDate; // 자동 이체 날짜

    public BankAccount() {
    }

    public BankAccount(String accNum, String custName, double interest, long balance) {
        super(accNum, custName, interest, balance);
        this.autoTransDate = autoTransDate;
    }

    public void transMoney(long money) {
        if(getBalance() < money) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        setBalance(this.getBalance() - money);
    }

    @Override
    public String toString() {
        return super.toString() + " 자동 이체 날짜: " + autoTransDate;
    }
}
