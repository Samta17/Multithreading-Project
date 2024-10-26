package com.june12;

public class Job1 extends Thread {

	@Override
	public void run()
	{
		System.out.println("Start of thread 1");
		for(int i=0; i<10; i++)
		{
		System.out.println(Thread.currentThread().getName());
		System.out.println("Samta");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println("End of thread 1");
	}
}
