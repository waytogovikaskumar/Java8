package com.javaEightLambda;
@FunctionalInterface
interface Sayable{
	public String say();
}

//Java Lambda Expression Example: No Parameter

public class LambdaExpressionExample3 {

	public static void main(String[] args) {
      
    Sayable s = ()->{
		return "i have nothing to say";
    	
    };
    System.out.println(s.say());
	}

}
