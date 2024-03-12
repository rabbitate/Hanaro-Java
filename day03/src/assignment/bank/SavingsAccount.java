package assignment.bank;

import java.util.Date;

public class SavingsAccount extends Account{
    private String startDate;
    private String endDate;
    private long payment; // 납입금

    public SavingsAccount() {
    }

    public SavingsAccount(String accNum, String custName, double interest, long balance, String startDate, String endDate, long payment) {
        super(accNum, custName, interest, balance);
        this.startDate = startDate;
        this.endDate = endDate;
        this.payment = payment;
    }

    @Override
    public double getCalInterest() {
        int date = Integer.parseInt(endDate) - Integer.parseInt(startDate);
        return (date * (payment / 30) * getInterest()) / 365;
    }

    @Override
    public String toString() {
        return super.toString() + " 적금 시작일: " + startDate + " 적금 만기일: " + endDate + " 납입금: " + payment;
    }
}
