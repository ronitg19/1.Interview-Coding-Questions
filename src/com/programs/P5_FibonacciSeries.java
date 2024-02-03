package com.programs;

public class P5_FibonacciSeries {

	public static void main(String[] args) {
		int input=10; //Total Elements In Series
		int value1=0;
		int value2=1;
		
		for(int i=1; i<=input; i++) {
			System.out.print(value1+ " ");
			int temp=value1;
			value1=value1 + value2;
			value2=temp;
		}
	}
}
