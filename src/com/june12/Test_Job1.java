package com.june12;

public class Test_Job1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("Main thread is running");
		Job1 obj1 = new Job1();
		
		Job1 obj2 = new Job1();
		obj1.setName("Amazon");
		obj1.start();
		obj2.setName("Mesho");
		System.out.println(obj2.getPriority());
		obj2.start();
		
		
		for(int i=0; i<10; i++)
		{
			System.out.println(Thread.currentThread().getName());
			System.out.println("Artuu");
			Thread.sleep(500);
		}
		System.out.println("End of main thraed");
	}

}
