package com.programs;

public class ReverseOfNumber {

	public static void main(String[] args) {
		int num = 1234;
		int temp = num;
		int rev = 0;
		while(num!=0) {
			int remainder = num % 10;
			rev = rev*10 + remainder;
			num = num/10;
		}
		System.out.println("Reverse of number "+temp+ " is "+rev);
	}
}
