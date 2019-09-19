package com.javaEightLambda;
//Java Lambda Expression Example: Creating Thread

public class LambdaExpressionExample8 {

	public static void main(String[] args) {
       Runnable r = new Runnable() {
		
		@Override
		public void run() {
             System.out.println("--without lambda----");			
		}
	};
		
		Thread t= new Thread(r);
		t.start();
		System.out.println("-------------");
	
	
	Runnable r1 = () ->{
		System.out.println("with lambda----");
		
	};
	Thread t2 = new Thread(r1);
	t2.start();

	Runnable r2 = () -> System.out.println("with lambda----");
		

	Thread t3 = new Thread(r2);
	t3.start();
	
}
}