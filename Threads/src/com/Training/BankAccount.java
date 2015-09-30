package com.Training;

public class BankAccount {
	
	private double balance= 2000;

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public synchronized double deposit(double amt){
		
		balance=balance+amt;
		System.out.println("Amount Deposited:"+balance);
		notify();
		
		return balance;}
	public synchronized double withdraw(double amt){
		
		if(balance<amt)
		{
			System.out.println("Insufficient Balance-Will wait for transfer");
			try {
				wait();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//deposit(500);
		}
		 balance=balance-amt;
		System.out.println("Got the balance:"+balance);
		return balance;}


}
