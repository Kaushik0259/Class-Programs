package com.inheritancedemo;

public class SavingAccount extends BankAccount{

	public SavingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}
	
	public void withdraw(double amount)
	{
		if(getBalance() - amount<100)// this condition is for saving account
		{
			System.out.println(" You required to maintain the Minimmum balance that is 100INR ");
		}
		else
		{
			super.withdraw(amount);
		}
		
	}
	
	

}
