package com.concepts;

public class ThreadsDemo extends Thread {

	public static void main(String[] args) {
		ThreadsDemo t = new ThreadsDemo();
		t.start();
	
	}


	public  void run() {
		System.out.println("In Start");
	}
}
