package com.programs;

public class FactorsOfNumber {

	public static void main(String[] args) {
		int num = 28;
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				System.out.print(i+ ", ");
			}
		}
	}
}
