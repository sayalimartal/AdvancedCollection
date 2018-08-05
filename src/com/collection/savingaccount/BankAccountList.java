package com.collection.savingaccount;

import java.util.Set;
import java.util.TreeSet;

import com.collection.moviedetails.Movie_Details;

public class BankAccountList {
		
	public Set<Object> bankAccountList = new TreeSet<>();
		
	public void addAccount(SavingAccount account)
	{
		bankAccountList.add(account);
	}
	
	public void removeAccount(SavingAccount account)
	{
		bankAccountList.remove(account);
	}

}
