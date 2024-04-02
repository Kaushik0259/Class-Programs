package com.inheritancedemo;

public class BankAccount {
	
	public String accountNumber;
	public double balance;
	
	public BankAccount(String accountNumber, double balance)
	{
		super();// refer to object class in background
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public void deposit(double amount)
	{
		//balance = balance + amount;
		balance+=amount;
	}
	
	public void withdraw(double amount)//this condition for bank account
	{
		if(balance >=amount) 
		{
			//balance = balance - amount;
			balance-=amount;
		}
		else
		{
			System.out.println("Insufficient amount");
		}
	}
	
	public double getBalance()
	{
		return balance;
	}

}
