//Create Savings Account objects and add them to ArrayList and display them
package com.collection.savingaccounttest;

import java.util.ArrayList;
import com.collection.savingaccount.SavingAccount;

public class SavingAccountTest {

	public static void main(String[] args) {
		
		ArrayList<SavingAccount> savingAcc = new ArrayList<>();      //ArrayList of Savings accounts
		
		savingAcc.add(new SavingAccount(10000,54,"Sayali",false));   //Add 5 Savings account objects to the list
		savingAcc.add(new SavingAccount(20000,55,"Siddhi",true));
		savingAcc.add(new SavingAccount(15000,56,"Nishad",false));
		savingAcc.add(new SavingAccount(14000,58,"Mehek",true));
		savingAcc.add(new SavingAccount(16000,59,"Drishti",true));
		
		savingAcc.stream().forEach(System.out::println);  //Display all account details
		
	}
}
