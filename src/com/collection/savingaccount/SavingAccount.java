package com.collection.savingaccount;

public class SavingAccount implements Comparable<SavingAccount> {
	
	private double accBalance;
	private int accId;
	private String accountHolderName;
	private boolean isSalaryAccount;
	private static final double MINBAL=1500;
	
	public SavingAccount(double accBalance, int accId, String accountHolderName, boolean isSalaryAccount) {
		super();
		this.accBalance = accBalance;
		this.accId = accId;
		this.accountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}
	
	public static double getMinbal() {
		return MINBAL;
	}


	public double getAccBalance() {
		return accBalance;
	}
	
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	
	public double getAccId() {
		return accId;
	}
	
	public void setAccId(int accId) {
		this.accId = accId;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
	public void withdraw(double amount) {
		if(isSalaryAccount()) {
			if(accBalance>amount && amount>0)
				this.accBalance-=amount;
			else
				System.out.println("Withdrawal failed");
		}
		else {
			if(accBalance-amount>=MINBAL)
				this.accBalance-=amount;
			else
				System.out.println("Withdrawal failed");	
		}
	}
	
	public void deposit(double amount) {
		if(amount>0)
			this.accBalance += amount;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + accId;
		result = prime * result + ((accountHolderName == null) ? 0 : accountHolderName.hashCode());
		result = prime * result + (isSalaryAccount ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingAccount other = (SavingAccount) obj;
		if (Double.doubleToLongBits(accBalance) != Double.doubleToLongBits(other.accBalance))
			return false;
		if (accId != other.accId)
			return false;
		if (accountHolderName == null) {
			if (other.accountHolderName != null)
				return false;
		} else if (!accountHolderName.equals(other.accountHolderName))
			return false;
		if (isSalaryAccount != other.isSalaryAccount)
			return false;
		return true;
	}

	@Override
	public int compareTo(SavingAccount savingAcc) {
		return this.accId-savingAcc.accId;
	}

	@Override
	public String toString() {
		return "SavingAccount [accBalance=" + accBalance + ", accId=" + accId + ", accountHolderName="
				+ accountHolderName + ", isSalaryAccount=" + isSalaryAccount + "]";
	}
	
	
}
