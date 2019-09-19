package com.javaEightLambda;

public class LambdaExpressionExample {

	public static void main(String[] args) {
	int width =10;
	
	 //without lambda, Drawable implementation using anonymous class
	Drawable drawable = new Drawable() {

		@Override
		public void draw() {
		
			System.out.println("  Drawing :   " + width );
		}
		
	};
	
	drawable.draw();

	}

}
