package com.Training;

import java.io.IOException;

public class JoinExample {
	
	public static void main(String ar[])
	{
		System.out.println("Main started.");
		Thread t=new Thread(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Reading");
					try {
						System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Finished Reading");
			}
				
			
		};
		t.start();
		//System.out.println("Is the thread alive "+t.isAlive());
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Finished.");
		
	}

}
