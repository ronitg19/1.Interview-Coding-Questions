package com.programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		int input= 111;
		int temp=input;
		int sum=0;
		
		while(input !=0) {
			int remainder = input%10;
			sum = sum*10 + remainder;
			input = input/10;
		}
		if(sum==temp){
			System.out.println(temp+ " is Palindrome number");
		}else {
			System.out.println(temp+ " is not Palindrome number");
		}
	}
}
