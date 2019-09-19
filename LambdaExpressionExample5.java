package com.javaEightLambda;

//Java Lambda Expression Example: Multiple Parameters
@FunctionalInterface
interface Addable{
	int add(int a, int b);
}

public class LambdaExpressionExample5 {

	public static void main(String[] args) {
		
		// Multiple parameters in lambda expression  
		Addable ad = (a,b)->{
			return (a+b);
		};
		System.out.println(ad.add(10, 5));
		
		  // Multiple parameters with data type in lambda expression without return statement  
        Addable ad2=(a,b)->(a+b);  
        System.out.println(ad2.add(100,200));  

        // Multiple parameters with data type in lambda expression return statement  
        Addable ad3=(int a,int b)->(a+b);  
        System.out.println(ad3.add(1020,2200));  
	}

}
