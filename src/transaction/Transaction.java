package transaction;

import account.Account;

public class Transaction {
	public static double getAmount;
    public static double getBalance;
    public static Object transaction;
    public Account from;
    public Account to;
    private double amount;
    private boolean success;
    public Transaction(Account from, Account to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }
    public Account getFrom() {
        return from;
    }
    public void setFrom(Account from) {
        this.from = from;
    }
    public Account getTo() {
        return to;
    }
    public void setTo(Account to) {
        this.to = to;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
    

}
