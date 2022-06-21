package exception;

import transaction.Transaction;

public class InvalidTransactionException extends Exception {
    private double getAmount;
    
    private double amount;

    public void InvalidAccountException( double amount) {
        this.amount = (double) Transaction.transaction.getAmount;
    }

    public double getGetAmount() {
        return getAmount;
    }

    public void setGetAmount(int getAmount) {
        this.getAmount = getAmount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    
}