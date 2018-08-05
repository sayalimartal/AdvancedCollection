//Display Savings account  details without duplicates and sorted using account Id
package com.collection.savingaccounttest;

import java.util.Collections;
import java.util.List;

import com.collection.savingaccount.BankAccountList;
import com.collection.savingaccount.SavingAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccountList bankAccount= new BankAccountList();
		
		SavingAccount acc1=new SavingAccount(10000,59,"Sayali",false);  //Create Savings accounts
		SavingAccount acc2=new SavingAccount(20000,54,"Siddhi",true);
		SavingAccount acc3=new SavingAccount(15000,55,"Nishad",false);
		SavingAccount acc4=new SavingAccount(14000,58,"Mehek",true);
		SavingAccount acc5=new SavingAccount(16000,52,"Drishti",true);
		
		bankAccount.addAccount(acc1);  //Add accounts
		bankAccount.addAccount(acc2);
		bankAccount.addAccount(acc3);
		bankAccount.addAccount(acc4);
		bankAccount.addAccount(acc5);
		
		bankAccount.removeAccount(acc3);  //Remove accounts from list
		bankAccount.removeAccount(acc5);
		
		bankAccount.bankAccountList.stream().forEach(System.out::println);  //Display all account details sorted using account Id

	}

}
