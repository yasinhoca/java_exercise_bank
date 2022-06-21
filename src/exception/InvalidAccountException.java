package exception;

public class InvalidAccountException extends Exception {
	private String IBAN;

    public InvalidAccountException(String IBAN) {
        this.IBAN = (String) account.Account.getIBAN;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    } 
}