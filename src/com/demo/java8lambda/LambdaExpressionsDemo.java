package com.demo.java8lambda;

public class LambdaExpressionsDemo {

	public static void main(String[] args) {
		
		PerformAction add = (a,b) -> (a+b);
		System.out.println("(6+3) : " + add.perform(6, 3));
		
		PerformAction sub = (a,b) -> (a-b);
		System.out.println("(6-3) : " + sub.perform(6, 3));
		
		PerformAction mul = (a,b) -> (a*b);
		System.out.println("(6*3) : " + mul.perform(6, 3));
		

	}

}
