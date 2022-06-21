package exception;

public class NoSuchAccountException extends Exception {
	private String IBAN;

    public NoSuchAccountException(String IBAN) {
        this.IBAN = (String) account.Account.getIBAN;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    } 
}
