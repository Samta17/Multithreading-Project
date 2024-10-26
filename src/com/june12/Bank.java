package com.june12;

public class Bank extends Thread {
	
	static int balance = 1000;
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
		Bank.payNow(200);
	}
	}

	synchronized private static void payNow(int amt) {
		System.out.println(Thread.currentThread().getName());
		if(balance > amt)
		{
			balance = balance-amt;
			System.out.println(balance);
		}
		else
		{
			System.out.println("Insufficient balance...");
		}
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Samta");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
