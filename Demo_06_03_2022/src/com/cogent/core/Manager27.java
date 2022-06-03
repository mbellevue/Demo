package com.cogent.core;
class Thread27A extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
class Thread27B extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class Manager27 {

	public static void main(String[] args) {
		Thread27A t1 = new Thread27A();
		t1.setName("Jack");
		Thread27A t2 = new Thread27A();
		t2.setName("Jamie");
		t1.start();
		t2.start();
		t1.run();
		t2.run();
		System.out.println(Thread.currentThread().getName());
	}

}
