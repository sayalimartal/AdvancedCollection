package com.collection.savingaccounttest;

import com.collection.savingaccount.SavingAccount;

public class SavingAccountTest {

	public static void main(String[] args) {
		
		SavingAccount[] savingAcc = new SavingAccount[5];
		
		savingAcc[0]=new SavingAccount(10000,54,"Sayali",false);
		savingAcc[1]=new SavingAccount(20000,55,"Siddhi",true);
		savingAcc[2]=new SavingAccount(15000,56,"Nishad",false);
		savingAcc[3]=new SavingAccount(14000,58,"Mehek",true);
		savingAcc[4]=new SavingAccount(16000,59,"Drishti",true);
		
		for(SavingAccount account:savingAcc)
			System.out.println(account);
		
	}
}
