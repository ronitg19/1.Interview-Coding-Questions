package com.programs;

public class FibonacciSeries {

	public static void main(String[] args) {
		int input=10;
		int value1=0;
		int value2=1;
		
		for(int i=1; i<=input; i++) {
			System.out.println(value1+ "");
			int temp=value1;
			value1=value1 + value2;
			value2=temp;
		}
	}
}
