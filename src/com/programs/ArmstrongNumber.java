package com.programs;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input=153;
		int temp = input;
		int sum=0;
		
		while(input!=0) {
			int remainder = input%10;
			sum = sum + (remainder*remainder*remainder);
			input = input/10;
		}
		if(sum== temp) {
			System.out.println(temp+ " is an Armstrog Number");
		}else {
			System.out.println(temp+ " is not an Armstrog Number");
		}
	}
}
