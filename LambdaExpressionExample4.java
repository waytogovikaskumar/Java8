package com.javaEightLambda;

//Java Lambda Expression Example: Single Parameter

@FunctionalInterface
interface Sayable1{
	
	String saying(String name);
}

public class LambdaExpressionExample4 {

	public static void main(String[] args) {
		
	    // Lambda expression with single parameter.  
      Sayable1 s = (name)->{
    	return "Hello  " + name ;
    	  
      };
      System.out.println(s.saying("Vikas"));
 	 System.out.println("-----------------------------------");

	
 	   // You can omit function parentheses    
	Sayable1 s1 = name ->{
		return "Hi " + name;
	};
	 System.out.println(s1.saying("Akash"));
	
	}
}
