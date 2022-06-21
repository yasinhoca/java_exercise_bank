package transaction;

import account.Account;
import exception.InvalidTransactionException;

public class TransactionValidator {
	public static void validateAmount (int amount) throws InvalidTransactionException {
        boolean sa = amount >= 0;
        try {
            sa = true;
        } catch (Exception InvalidTransactionException) {
            System.out.println("Exception" + sa);

        }
    }
    public static void validateAccountAmount (Account account) throws InvalidTransactionException {
        
        boolean ss = (int) transaction.Transaction.getAmount > (int) transaction.Transaction.getBalance;
        try {
            ss = true;
        } catch (Exception InvalidTransactionException) { 

            System.out.println("not enough money" + ss);

        }
    }

}
