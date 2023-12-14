package com.programs;

public class Factorial {

	public static void main(String[] args) {
		int num=5;
		int fact=1;
		if(num==0) {
			System.out.println("Factorial of "+num+ " is 1");
		}else {
			for(int i=1;i<=num; i++ ) {
				fact *=i;
			}
			System.out.println("Factorial of "+num+ " is "+fact);
		}
	}
}
