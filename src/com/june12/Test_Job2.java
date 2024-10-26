package com.june12;

public class Test_Job2 {
	
	public static void main(String[] args) {
		Job2 obj1 = new Job2();
		Thread t1 = new Thread(obj1);
		t1.setName("Amazon");
		t1.start();
		
		System.out.println("Hello");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
