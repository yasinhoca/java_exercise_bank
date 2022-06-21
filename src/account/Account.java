package account;

public class Account {
	public String IBAN;
    public static double balance;
    public static Object getIBAN;
    public static Object from;
    public Account(String IBAN, double balance) {
        this.IBAN = IBAN;
        Account.balance = balance;
    }
    public String getIBAN() {
        return IBAN;
    }
    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }
    public static double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        Account.balance = balance;
    }
    

}
