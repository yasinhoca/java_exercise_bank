
//I hereby certify that I have completed this lab assignment on my own without any help from anyone else. 
//I understand that the only sources of authorized information in this lab assignment are (1) the course textbook, 
//(2) the materials posted at the course website and (3) any study notes handwritten by myself. 
//I have not used, accessed or received any information from any other unauthorized source in taking this lab assignment. 
//The effort in the assignment thus belongs completely to me. READ AND SIGN BY WRITING YOUR NAME SURNAME AND STUDENT ID SIGNATURE:Mehmet Furkan Geckil 68944

package main;

import account.Account;
import exception.InvalidAccountException;

public class Main {

	public static void main(String[] args) throws InvalidAccountException {
		Bank bank = new Bank("Yapi Kredi", null, null, null, null);
		
		Account account1 = new Account("TR290001500158007303871234", 50);
		Account account2 = new Account("TR290001500158007303875678", 50);
		Account account3 = new Account("TR290001500", 50);
		Account account4 = new Account("290001500", 50);
		
		bank.addAccount(account1, false);
		bank.addAccount(account2, false);
		bank.addAccount(account3, false);
		bank.addAccount(account4, false);
		
		bank.transact("TR290001500158007303871234", "TR290001500158007303875678", 5, "TL");
		bank.transact("TR290001500158007303871234", "TR290001500158007303875678", -20, "TL");
		
		
		System.out.println("\n---------------------Transactions---------------------");
		bank.printAllTransactions();
	}
	
}
