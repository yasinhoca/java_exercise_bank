package main;

import account.Account;
import account.AccountValidator;
import exception.InvalidAccountException;
import transaction.Transaction;
import transaction.TransactionValidator;
import java.util.HashMap;
import java.util.ArrayList;

public class Bank {



    
    String name;
    AccountValidator accountValidator;
    TransactionValidator transactionValidator;
    HashMap<String, Account> accounts = new HashMap<>();
    ArrayList<Transaction> transaction;
    boolean acc;
   

    public Bank(String name, AccountValidator accountValidator, TransactionValidator transactionValidator,
            HashMap<String, Account> accounts, ArrayList<Transaction> transaction) {
        this.name = name;
        this.accountValidator = accountValidator;
        this.transactionValidator = transactionValidator;
        this.accounts = accounts;
        this.transaction = transaction;
    }
    private void validateAccountIBAN(Account account, boolean acc) {
        boolean as = ((AccountValidator) Account.getIBAN).startsWith("TR");
        if (as) {
            acc = true;
        } else {
            acc = false;
        }

    }
    public void addAccount(Account account, boolean acc) throws InvalidAccountException {
        validateAccountIBAN(account, acc);
        if (acc = true){
            accounts.put(name, account);
        } else {
            try {
                
            } catch (Exception InvalidAccountException) {
                System.out.println("Invalid ID");
            }
        }
        
    }

    

    public void transact(String IBAN, String to, int amount, String string) {
        
        double from.setBalance = Account.from.getBalance() - amount;
    }



    
    public void printAllTransactions() {
    }
	
}
