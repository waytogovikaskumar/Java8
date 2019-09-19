package com.javaEightLambda;

import java.util.ArrayList;
import java.util.List;

//Java Lambda Expression Example: Foreach Loop

public class LambdaExpressionExample6 {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		list.add("v");
		list.add("vik");
		list.add("a");
		list.add("r");
		list.add("t");
		list.add("e");
		list.add("l");
		
		//in java 7
		for (String string : list) {
			System.out.println(string);
			
		}
		System.out.println("===================================");
		//in java 8
		list.forEach(l -> System.out.println(l));
		System.out.println("===================================");
		//or
		list.forEach((l) -> System.out.println(l));

	}

}
