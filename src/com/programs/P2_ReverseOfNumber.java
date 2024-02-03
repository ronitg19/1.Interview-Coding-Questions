package com.programs;

public class P2_ReverseOfNumber {

	public static void main(String[] args) {
		int num = 1234;
		int temp = num;
		int rev = 0;
		while(num!=0) {
			int remainder = num % 10; //Here we got Remainder
			rev = rev*10 + remainder;
			num = num/10; //Here We got Quotient part
		}
		System.out.println("Reverse of number "+temp+ " is "+rev);
	}
}
