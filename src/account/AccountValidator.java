package account;

import java.util.Map;

import exception.InvalidAccountException;
import exception.NoSuchAccountException;

public class AccountValidator {
	public static void validateAccountIBAN (Account account) throws InvalidAccountException{
        
        boolean as = ((AccountValidator) Account.getIBAN).startsWith("TR");
        try {
           as = true && ((AccountValidator) Account.getIBAN).length() != 26;
           
        } catch (Exception InvalidAccountException) {
            System.out.println("Invalid ID");
            System.out.println(as);
        }
       
    }
    
    public static void validateExistence(Map <String, Account> accounts, String IBAN, String bankName) throws NoSuchAccountException{
        try{
            
        } catch (Exception NoSuchAccountException)  {
            System.out.println("Exception");
        }
    }
    private int length() {
        return 0;
    }
    public boolean startsWith(String string) {
        return false;
    }
}
