package com.programs;

public class P7_FactorsOfNumber {

	public static void main(String[] args) {
		int num = 131;
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				System.out.print(i+ ", ");
			}
		}
	}
}
