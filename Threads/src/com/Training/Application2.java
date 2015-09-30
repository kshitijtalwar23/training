package com.Training;

public class Application2 {
	
	public static void main(String ar[])
	{
		final BankAccount bk=new BankAccount();
		
		Thread t1=new Thread(){
			
			public void run(){
				bk.withdraw(3000);
			}
			
		};
		
		t1.start();
		
		
		Thread t2=new Thread(){
			
			public void run(){
				bk.deposit(500);
			}
		}; 
		
		t2.start();
	}

}
