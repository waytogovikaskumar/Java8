package com.javaEightLambda;
//Java Lambda Expression Example: Multiple Statements

@FunctionalInterface
interface Sayable2{
	String say1(String message);
	
}
public class LambdaExpressionExample7 {

	public static void main(String[] args) {
	
		 // You can pass multiple statements in lambda expression  
		Sayable2 s2 = (message) ->{
			String s3 = "i would like to say ";
			String s4 = s3 + message;
			return s4;
			
		};
		System.out.println(s2.say1("Time is money"));
		
	}

}
